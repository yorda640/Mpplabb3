import java.io.IOException;

// Interface for carriers
interface Carrier {
    double calculateCost(double weight, String zone);
    String getName();
}

