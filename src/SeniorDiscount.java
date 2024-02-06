class SeniorDiscount implements DiscountCategory {
    @Override
    public double applyDiscount(double cost) {
        return 0.85 * cost; // 15% discount
    }
}

