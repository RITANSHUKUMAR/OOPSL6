import java.util.*;

// Base class EMPLOYEE
class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic;
    double DA;
    double Gross_Sal;
    double Net_Sal;

    // Method to read employee details
    void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        this.Ename = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        Eid = scanner.nextInt();
        System.out.print("Enter Basic Salary: ");
        Basic = scanner.nextDouble();
    }

    // Method to compute net salary
    void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        Net_Sal = Gross_Sal - (0.30 * Gross_Sal); // Assumes 30% deductions
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }
}

// Subclass PartTimeEmp
class PartTimeEmp extends EMPLOYEE {
    private int hoursWorked;
    private static final double HOURLY_RATE = 20.0; // Example hourly rate

    // Method to set hours worked
    void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Override compute_net_sal method
    @Override
    void compute_net_sal() {
        Gross_Sal = hoursWorked * HOURLY_RATE;
        Net_Sal = Gross_Sal; // No additional deductions for part-time
    }

    // Override display method
    @Override
    void display() {
        super.display(); // Call base class display
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + HOURLY_RATE);
    }
}

// Subclass FullTimeEmp
class FullTimeEmp extends EMPLOYEE {
    private double bonus;
    private double deductions;

    // Method to set bonus and deductions
    void setBonus(double bonus) {
        this.bonus = bonus;
    }

    void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    // Override compute_net_sal method
    @Override
    void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA + bonus;
        Net_Sal = Gross_Sal - deductions;
    }

    // Override display method
    @Override
    void display() {
        super.display(); // Call base class display
        System.out.println("Bonus: " + bonus);
        System.out.println("Deductions: " + deductions);
    }
}

// Main class to check the functionality
public class L3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int N = scanner.nextInt();

        EMPLOYEE[] employees = new EMPLOYEE[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter type of employee (1 for FullTime, 2 for PartTime): ");
            int type = scanner.nextInt();

            if (type == 1) { // FullTimeEmp
                FullTimeEmp emp = new FullTimeEmp();
                System.out.println("Enter details of Full-Time employee " + (i + 1) + ":");
                emp.read();
                System.out.print("Enter Bonus: ");
                emp.setBonus(scanner.nextDouble());
                System.out.print("Enter Deductions: ");
                emp.setDeductions(scanner.nextDouble());
                emp.compute_net_sal();
                emp.display();
            } else if (type == 2) { // PartTimeEmp
                PartTimeEmp emp = new PartTimeEmp();
                System.out.println("Enter details of Part-Time employee " + (i + 1) + ":");
                emp.read();
                System.out.print("Enter Hours Worked: ");
                emp.setHoursWorked(scanner.nextInt());
                emp.compute_net_sal();
                emp.display();
            } else {
                System.out.println("Invalid type. Skipping.");
                i--; // Decrement to retry this index
            }
            System.out.println();
        }
    }
}
