public class PaymentFactory {

    public static PaymentStrategy getPayment(String type) {
        if (type.equals("UPI")) return new UPIPayment();
        return new CardPayment();
    }
}
