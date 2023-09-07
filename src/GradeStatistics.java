10import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables to store total, maximum, and minimum grades
        double total = 0;
        double maximum = Double.NEGATIVE_INFINITY; // Initialize maximum to negative infinity
        double minimum = Double.POSITIVE_INFINITY; // Initialize minimum to positive infinity

        // Prompt the user to enter 10 grades
        for (int i = 1; i <= 10; i++) {
            while (true) {
                try {
                    System.out.print("Enter grade " + i + ": ");
                    double grade = scanner.nextDouble();
                    total += grade;
                    if (grade > maximum) {
                        maximum = grade;
                    }
                    if (grade < minimum) {
                        minimum = grade;
                    }
                    break; // Exit the loop if the input is a valid floating-point number
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid floating-point number.");
                    scanner.nextLine(); // Clear the invalid input from the scanner
                }
            }
        }

        // Calculate and print the average, maximum, and minimum grades
        double average = total / 10;
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        scanner.close();
    }
}
