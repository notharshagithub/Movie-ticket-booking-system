public class DefaultPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(Seat seat) {
        switch (seat.getType()) {
            case GOLD: return 200;
            case PLATINUM: return 300;
            default: return 100;
        }
    }
}
