import java.util.Scanner;

// Superclass
class Employee {
    int empId;
    String name;
    double basicSalary;

    // Method to read employee details
    void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    // Method to display common employee details
    void displayEmployeeDetails() {
        System.out.println("\nEmployee ID      : " + empId);
        System.out.println("Employee Name    : " + name);
        System.out.println("Basic Salary     : " + basicSalary);
    }
}

// Subclass
class PermanentEmployee extends Employee {
    double hra, da, grossSalary;

    // Method to read HRA and DA
    void getSalaryDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        da = sc.nextDouble();
    }

    // Method to calculate gross salary
    void calculateGrossSalary() {
        grossSalary = basicSalary + hra + da;
    }

    // Method to display all details
    void displayDetails() {
        displayEmployeeDetails();
        System.out.println("HRA              : " + hra);
        System.out.println("DA               : " + da);
        System.out.println("Gross Salary     : " + grossSalary);
    }
}

// Main class
public class SingleInheritance {
    public static void main(String[] args) {

        PermanentEmployee emp = new PermanentEmployee();

        emp.getEmployeeDetails();
        emp.getSalaryDetails();
        emp.calculateGrossSalary();
        emp.displayDetails();
    }
}