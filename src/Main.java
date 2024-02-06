import java.io.IOException;

public class Main {
    public static double getDouble() throws IOException {
        String s = getString();
        return Double.parseDouble(s);
    }

    public static String getString() throws IOException {
        // Method to read string input from user
        return "Placeholder";
    }

    public static void main(String[] args) {
        // Create carriers
        Carrier ups = new UPS();
        Carrier usMail = new USMail();
        Carrier fedEx = new FedEx();

        // Create discount categories
        DiscountCategory studentDiscount = new StudentDiscount();
        DiscountCategory seniorDiscount = new SeniorDiscount();

        // Create packages
        Package[] packages = {
                new Package("Book", 2, "IA", fedEx),
                new Package("Phone", 4, "MA", ups),
                new Package("Boots", 6, "NY", fedEx)
        };

        // Print package details and calculate cost
        for (Package pkg : packages) {
            double cost = pkg.calculateCost();
            System.out.print(pkg.getDescription() + "\t$" + String.format("%.2f", cost) + "\t" + pkg.getCarrier().getName());

            // Apply discount based on category
            if (/* check if student */) {
                cost = studentDiscount.applyDiscount(cost);
                System.out.print(" (Student Discount)");
            } else if (/* check if senior */) {
                cost = seniorDiscount.applyDiscount(cost);
                System.out.print(" (Senior Discount)");
            }

            System.out.println();
        }
    }
}
