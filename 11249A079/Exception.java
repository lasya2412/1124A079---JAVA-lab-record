import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // NumberFormatException
        try {
            System.out.print("Enter age: ");
            String age = sc.nextLine();

            int num = Integer.parseInt(age);
            System.out.println("Age = " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        }

        // ArithmeticException
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            int result = 100 / n;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        sc.close();
    }
}