import java.util.Scanner;

// Base class
class Student {
    protected String name;
    protected int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Derived class Sports
class Sports extends Student {
    protected int sGrade;

    public Sports(String name, int id, int sGrade) {
        super(name, id);
        this.sGrade = sGrade;
    }
}

// Derived class Exam
class Exam extends Student {
    protected int eGrade;

    public Exam(String name, int id, int eGrade) {
        super(name, id);
        this.eGrade = eGrade;
    }
}

// Derived class Results
class Results extends Sports {
    private int eGrade;
    private String finalResult;

    public Results(String name, int id, int sGrade, int eGrade) {
        super(name, id, sGrade);
        this.eGrade = eGrade;
        calculateResult();
    }

    private void calculateResult() {
        if (sGrade >= 50 && eGrade >= 50) {
            finalResult = "Pass";
        } else {
            finalResult = "Fail";
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Sports Grade: " + sGrade);
        System.out.println("Exam Grade: " + eGrade);
        System.out.println("Final Result: " + finalResult);
    }
}

// Main class to take input from user and illustrate usage
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for student 1
        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Id: ");
        int id1 = scanner.nextInt();
        System.out.print("Sports Grade: ");
        int sGrade1 = scanner.nextInt();
        System.out.print("Exam Grade: ");
        int eGrade1 = scanner.nextInt();
        scanner.nextLine(); // consume the newline character left by nextInt()

        Results student1 = new Results(name1, id1, sGrade1, eGrade1);
        student1.display();

        // Input for student 2
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Id: ");
        int id2 = scanner.nextInt();
        System.out.print("Sports Grade: ");
        int sGrade2 = scanner.nextInt();
        System.out.print("Exam Grade: ");
        int eGrade2 = scanner.nextInt();

        Results student2 = new Results(name2, id2, sGrade2, eGrade2);
        student2.display();

        scanner.close();
    }
}
