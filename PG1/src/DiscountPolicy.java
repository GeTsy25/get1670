public interface DiscountPolicy {

    /*
     * @param amount The original amount
     * @return The amount after the discount is applied.
     */
    double applyDiscount(double amount);    
}