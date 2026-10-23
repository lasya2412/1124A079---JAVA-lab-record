import java.util.Scanner;

// Level 1 - Student class
class Student {
    int rollNo;
    String name;

    void getStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
    }

    void displayStudentDetails() {
        System.out.println("\nRoll Number : " + rollNo);
        System.out.println("Name        : " + name);
    }
}

// Level 2 - Marks class inherits Student
class Marks extends Student {
    int m1, m2, m3, m4, m5;

    void getMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks in Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Enter Marks in Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Enter Marks in Subject 5: ");
        m5 = sc.nextInt();
    }
}

// Level 3 - Result class inherits Marks
class Result extends Marks {
    int total;
    double average;
    char grade;

    void calculateResult() {
        total = m1 + m2 + m3 + m4 + m5;
        average = total / 5.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';
    }

    void displayResult() {
        displayStudentDetails();

        System.out.println("Subject 1 Marks : " + m1);
        System.out.println("Subject 2 Marks : " + m2);
        System.out.println("Subject 3 Marks : " + m3);
        System.out.println("Subject 4 Marks : " + m4);
        System.out.println("Subject 5 Marks : " + m5);
        System.out.println("Total Marks     : " + total);
        System.out.println("Average Marks   : " + average);
        System.out.println("Grade           : " + grade);
    }
}

// Main class
public class MultilevelInheritance {
    public static void main(String[] args) {

        Result student = new Result();

        student.getStudentDetails();
        student.getMarks();
        student.calculateResult();
        student.displayResult();
    }
}