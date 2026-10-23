import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");

            if (age >= 18) {
                System.out.println("You are eligible for a driving license.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close();
    }
}
