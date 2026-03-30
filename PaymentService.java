public class PaymentService {

    private PaymentStrategy strategy;

    public PaymentService(String type) {
        this.strategy = PaymentFactory.getPayment(type);
    }

    public boolean pay(double amount) {
        return strategy.pay(amount);
    }
}
