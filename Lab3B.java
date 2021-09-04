// Lab 3B
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab3B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#####");

        double GPA;
        int[] hours = new int[4], grades = new int[4];
        int course = 1, totalHours = 0, qualityPoints = 0;

        for (int i = 0; i < hours.length; i++) {
            print("Course " + course + " hours: ");
            hours[course - 1] = sc.nextInt();

            print("Grade for course " + course + ": ");
            grades[course - 1] = sc.nextInt();

            course += 1;
        }

        for (int i = 0; i < hours.length; i++) {
            totalHours += hours[i];
            qualityPoints += hours[i] * grades[i];
        }

        GPA = Double.valueOf(qualityPoints) / Double.valueOf(totalHours);

        print("Total hours is: " + totalHours);
        print("\nTotal quality points is: " + qualityPoints);
        print("\nYour GPA for this semester is " + df.format(GPA));
    }

    public static void print(String s) {
        System.out.print(s);
    }
}
