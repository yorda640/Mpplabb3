class UPS implements Carrier {
    @Override
    public double calculateCost(double weight, String zone) {
        return 0.45 * weight;
    }

    @Override
    public String getName() {
        return "UPS";
    }
}

// Class for US Mail