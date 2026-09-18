public class YearlyMaintenanceCost {
    void main() {
        int springMaintenanceCost = 502;
        int summerMaintenanceCost = 203;
        int fallMaintenanceCost = 250;
        int winterMaintenanceCost = 619;

        int totalCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;
        String message = String.format("With a spring maintenance cost of $%d, a summer maintenance cost of $%d, a fall maintenance cost of $%d, and a winter maintenance cost of $%d, your total cost will be $%d.",
                springMaintenanceCost, summerMaintenanceCost, fallMaintenanceCost, winterMaintenanceCost, totalCost);

        IO.println(message);
    }
}
