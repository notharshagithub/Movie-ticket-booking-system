import java.util.List;

public class SeatLockService {

    public boolean lockSeats(Show show, List<Seat> seats) {
        synchronized (show) {
            for (Seat seat : seats) {
                if (show.getSeatStatus().get(seat.getId()) != SeatStatus.AVAILABLE)
                    return false;
            }
            for (Seat seat : seats) {
                show.getSeatStatus().put(seat.getId(), SeatStatus.LOCKED);
            }
            return true;
        }
    }

    public void confirmSeats(Show show, List<Seat> seats) {
        for (Seat seat : seats) {
            show.getSeatStatus().put(seat.getId(), SeatStatus.BOOKED);
        }
    }

    public void releaseSeats(Show show, List<Seat> seats) {
        for (Seat seat : seats) {
            show.getSeatStatus().put(seat.getId(), SeatStatus.AVAILABLE);
        }
    }
}
