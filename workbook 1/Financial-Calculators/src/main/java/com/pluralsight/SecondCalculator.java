import java.util.Scanner;

public class SecondCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)
        System.out.print("Enter your initial deposit amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        double rate = annualInterestRate / 100;

        double futureValue = principal * Math.pow(1 + (rate / 365), 365 * years);
        double interestEarned = futureValue - principal;
        System.out.println("Your CD's ending balance will be: " + futureValue);
        System.out.println("Total interest earned: " +interestEarned);
    }
}
