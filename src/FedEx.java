
class FedEx implements Carrier {
    @Override
    public double calculateCost(double weight, String zone) {
        double zoneRate;
        switch (zone) {
            case "IA":
            case "MT":
            case "OR":
            case "CA":
                zoneRate = 0.35;
                break;
            case "TX":
            case "UT":
                zoneRate = 0.30;
                break;
            case "FL":
            case "MA":
            case "OH":
                zoneRate = 0.55;
                break;
            default:
                zoneRate = 0.43;
        }
        return zoneRate * weight;
    }

    @Override
    public String getName() {
        return "FedEx";
    }
}

