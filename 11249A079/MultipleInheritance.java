import java.util.Scanner;

// First Interface
interface Sports {
    void getSportsMarks();
}

// Second Interface
interface Academics {
    void getAcademicMarks();
}

// Class implementing both interfaces
class Student implements Sports, Academics {
    int sportsMarks, academicMarks, total;
    Scanner sc = new Scanner(System.in);

    // Implementation of Sports interface
    public void getSportsMarks() {
        System.out.print("Enter Sports Marks: ");
        sportsMarks = sc.nextInt();
    }

    // Implementation of Academics interface
    public void getAcademicMarks() {
        System.out.print("Enter Academic Marks: ");
        academicMarks = sc.nextInt();
    }

    // Calculate total marks
    void calculateTotal() {
        total = sportsMarks + academicMarks;
    }

    // Display result
    void display() {
        System.out.println("\nSports Marks   : " + sportsMarks);
        System.out.println("Academic Marks : " + academicMarks);
        System.out.println("Total Marks    : " + total);
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {

        Student s = new Student();

        s.getSportsMarks();
        s.getAcademicMarks();
        s.calculateTotal();
        s.display();
    }
}