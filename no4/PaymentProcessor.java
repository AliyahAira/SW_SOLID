public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    // Constructor injection for PaymentMethod
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Method to process payment
    public void processPayment(Order order) {
        paymentMethod.pay(order.getAmount());
    }
}