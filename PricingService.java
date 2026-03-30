import java.util.List;

public class PricingService {

    private static PricingStrategy strategy = new DefaultPricingStrategy();

    public static double calculate(Show show, List<Seat> seats) {
        double total = 0;
        for (Seat seat : seats) {
            total += strategy.calculatePrice(seat);
        }
        return total;
    }
}
