public class SalesTax {
    void main() {
        double purchasePrice = 93.99;
        final double salesTaxPercentage = 5;

        double total = purchasePrice * (1 + (salesTaxPercentage/100));

        IO.println("Your purchase worth $" + purchasePrice + " at a tax of " + salesTaxPercentage + "% will cost $" + total);
    }
}