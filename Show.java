import java.time.LocalDateTime;
import java.util.Map;

public class Show {
    private String id;
    private Movie movie;
    private Screen screen;
    private LocalDateTime startTime;
    private Map<String, SeatStatus> seatStatus;

    public Map<String, SeatStatus> getSeatStatus() {
        return seatStatus;
    }
}
