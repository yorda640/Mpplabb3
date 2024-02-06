class StudentDiscount implements DiscountCategory {
    @Override
    public double applyDiscount(double cost) {
        return 0.9 * cost; // 10% discount
    }
}

// Class for Senior discount
