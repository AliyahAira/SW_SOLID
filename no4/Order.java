public class Order {
    private double amount;
    private PaymentMethod paymentMethod;

    public Order(double amount, PaymentMethod paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setAmount(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
}