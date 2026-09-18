public class MonthlyCCBalance {
    void main() {
        int creditCardBalance = 5000;
        double interestRatePercentage = .17; // assuming interest is per year

        final double interestForOneMonth = creditCardBalance * (interestRatePercentage / 12);
        final double interestForTwoMonths = (creditCardBalance + interestForOneMonth) * (interestRatePercentage / (12/2));

        IO.println("Your interest after one month: $" + (creditCardBalance + interestForOneMonth));
        IO.println("Your interest after two months: $" + (creditCardBalance + interestForTwoMonths));
    }
}
