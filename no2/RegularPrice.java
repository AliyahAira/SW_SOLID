public class RegularPrice implements DiscountPrice{

    @Override
    public double applyDiscount(double amount) {
        return 0.0;
    }
}