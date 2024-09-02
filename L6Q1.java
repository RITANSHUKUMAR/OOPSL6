package shanu;
import java.util.*;

// Base class STUDENT
class STUDENT {
    // Member variables
    private String sname;
    private int[] marks_array;
    private int total;
    private double avg;

    // Constructor to assign initial values
    public STUDENT() {}

    public STUDENT(String sname, int[] marks_array) {
        this.sname = sname;
        this.marks_array = marks_array;
    }

    // Method to display STUDENT object
    public void display() {
        System.out.println("Student Name: " + sname);
        System.out.println("Marks: ");
        for (int mark : marks_array) {
            System.out.print(mark + "\t");
        }
        System.out.println();
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }

    // Method to compute total and average marks
    public void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = (double) total / marks_array.length;
    }

    // Method to assign initial values
    public void assign(String sname, int[] marks_array) {
        this.sname = sname;
        this.marks_array = marks_array;
    }

    // Getter methods for encapsulation
    public int[] getMarksArray() {
        return marks_array;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}

// Subclass ScienceStudent
class ScienceStudent extends STUDENT {
    private int practicalMarks;

    // Constructor
    public ScienceStudent(String sname, int[] marks_array, int practicalMarks) {
        super(sname, marks_array); // Call to the base class constructor
        this.practicalMarks = practicalMarks;
    }

    // Overriding the compute method
    @Override
    public void compute() {
        int total = practicalMarks;
        for (int mark : getMarksArray()) {
            total += mark;
        }
        double avg = (double) total / (getMarksArray().length + 1);
        setTotal(total);
        setAvg(avg);
    }

    // Display practical marks
    public void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }
}

// Subclass ArtsStudent
class ArtsStudent extends STUDENT {
    private String electiveSubject;

    // Constructor
    public ArtsStudent(String sname, int[] marks_array, String electiveSubject) {
        super(sname, marks_array); // Call to the base class constructor
        this.electiveSubject = electiveSubject;
    }

    // Method to display elective subject
    public void displayElectiveSubject() {
        System.out.println("Elective Subject: " + electiveSubject);
    }
}

public class L3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a STUDENT object
        System.out.println("Enter the name of the student:");
        String studentName = sc.nextLine();
        System.out.println("Enter the number of subjects:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        STUDENT student = new STUDENT(studentName, marks);
        student.compute();
        student.display();

        // Create a ScienceStudent object
        System.out.println("\nEnter the name of the science student:");
        sc.nextLine(); // Consume the newline
        String scienceStudentName = sc.nextLine();
        System.out.println("Enter the number of subjects:");
        n = sc.nextInt();
        int[] scienceMarks = new int[n];
        System.out.println("Enter the marks:");
        for (int i = 0; i < n; i++) {
            scienceMarks[i] = sc.nextInt();
        }
        System.out.println("Enter the practical marks:");
        int practicalMarks = sc.nextInt();
        ScienceStudent scienceStudent = new ScienceStudent(scienceStudentName, scienceMarks, practicalMarks);
        scienceStudent.compute();
        scienceStudent.display();
        scienceStudent.displayPracticalMarks();

        // Create an ArtsStudent object
        System.out.println("\nEnter the name of the arts student:");
        sc.nextLine(); // Consume the newline
        String artsStudentName = sc.nextLine();
        System.out.println("Enter the number of subjects:");
        n = sc.nextInt();
        int[] artsMarks = new int[n];
        System.out.println("Enter the marks:");
        for (int i = 0; i < n; i++) {
            artsMarks[i] = sc.nextInt();
        }
        System.out.println("Enter the elective subject:");
        sc.nextLine(); // Consume the newline
        String electiveSubject = sc.nextLine();
        ArtsStudent artsStudent = new ArtsStudent(artsStudentName, artsMarks, electiveSubject);
        artsStudent.compute();
        artsStudent.display();
        artsStudent.displayElectiveSubject();

        // Demonstrate dynamic polymorphism
        System.out.println("\nDemonstrating Dynamic Polymorphism:");
        STUDENT ref;
        
        ref = scienceStudent;
        ref.display(); // This will call ScienceStudent's display method

        ref = artsStudent;
        ref.display(); // This will call ArtsStudent's display method
    }
}
