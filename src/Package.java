class Package {
    private String description;
    private double weight;
    private String zone;
    private Carrier carrier;

    public Package(String description, double weight, String zone, Carrier carrier) {
        this.description = description;
        this.weight = weight;
        this.zone = zone;
        this.carrier = carrier;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    public String getZone() {
        return zone;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public double calculateCost() {
        return carrier.calculateCost(weight, zone);
    }
}

