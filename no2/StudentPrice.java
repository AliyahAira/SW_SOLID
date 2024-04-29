public class StudentPrice implements DiscountPrice {
    public double applyDiscount(double amount) {
        return amount * 0.05;
    }
}