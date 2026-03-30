import java.util.List;

public class BookingService {

    private SeatLockService seatLockService = new SeatLockService();
    private PaymentService paymentService = new PaymentService("UPI");

    public Booking createBooking(Show show, List<Seat> seats) {

        if (!seatLockService.lockSeats(show, seats)) {
            throw new RuntimeException("Seats not available");
        }

        double amount = PricingService.calculate(show, seats);

        boolean paid = paymentService.pay(amount);

        if (paid) {
            seatLockService.confirmSeats(show, seats);
            return new Booking();
        } else {
            seatLockService.releaseSeats(show, seats);
            throw new RuntimeException("Payment failed");
        }
    }
}
