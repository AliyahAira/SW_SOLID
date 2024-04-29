public class Customer {
    private String name;
    private DiscountPrice discountPrice;

    public Customer(String name, DiscountPrice discountPrice) {
        this.name = name;
        this.discountPrice = discountPrice;
    }
    
    public double applyDiscount (double amount) {
        return amount - discountPrice.applyDiscount(amount);
    }


    public void setName (String name){
        this.name = name;
    }

    public void setDiscountPrice (DiscountPrice discountPrice){
        this.discountPrice = discountPrice;
    }

    public String getName(){
     return name;
    }

    public String getDiscountPrice(String discountPrice){
     return discountPrice;

    }
}