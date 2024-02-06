
class USMail implements Carrier {
    @Override
    public double calculateCost(double weight, String zone) {
        if (weight < 3)
            return 1.00;
        else
            return 0.55 * weight;
    }

    @Override
    public String getName() {
        return "US Mail";
    }
}

