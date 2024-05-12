import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        System.out.println("Customer Weekly Average Tax Withholding Calculation");
        System.out.println(" ");

        Scanner inputScanner = new Scanner(System.in);
        int weeklyIncome;
        double taxRate;
        int taxToWithhold;

        System.out.print("Please enter weekly average income: $");
        weeklyIncome = inputScanner.nextInt();

            // Determine the tax rate from the weekly income

        if (weeklyIncome < 500) {
            taxRate = 0.10;
        }
        else if (weeklyIncome < 1500) {
            taxRate = 0.15;
        }
        else if (weeklyIncome < 2500) {
            taxRate = 0.20;
        }
        else {
            taxRate = 0.30;
        }
        taxToWithhold = (int)(weeklyIncome * taxRate);     // Truncate tax to an integer amount

        System.out.println("Tax Rate: " + taxRate);      // Print tax rate
        System.out.println("Tax to Withhold: $" + taxToWithhold);   // Print Tax amount to withhold

        }
    }
