// Lab 3A
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab3A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double amountDue, APR;
        DecimalFormat df = new DecimalFormat("#.#####");

        print("Amount owed: $");
        amountDue = sc.nextDouble();

        print("APR: ");
        APR = sc.nextDouble();

        print("Monthly percentage rate: " + df.format(APR / 12));

        df = new DecimalFormat("#.##");
        print("\nMinimum payment: $" + df.format((amountDue * (APR * 0.01)) / 12));
    }

    public static void print(String s) {
        System.out.print(s);
    }
}
