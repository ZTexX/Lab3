// Lab 3C
import java.util.Scanner;

public class Lab3C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double quarters, dimes, nickels, pennies, total;

        print("Enter the number of quarters: ");
        quarters = sc.nextInt();

        print("Enter the number of dimes: ");
        dimes = sc.nextInt();

        print("Enter the number of nickels: ");
        nickels = sc.nextInt();

        print("Enter the number of pennies: ");
        pennies = sc.nextInt();

        print("\nYou entered " + (int) quarters + " quarters.");
        print("\nYou entered " + (int) dimes + " dimes.");
        print("\nYou entered " + (int) nickels + " nickels.");
        print("\nYou entered " + (int) pennies + " pennies.");

        total = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);

        print("\n\nYour total is " + (int) total + " dollars and " + (int) ((total - (int) total) * 100) + " cents.");
    }

    public static void print(String s) {
        System.out.print(s);
    }
}
