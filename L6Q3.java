public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice Johnson", "January 1, 1990");
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Birth Date: " + person.getBirthDate());

        // Create a CollegeGraduate object
        CollegeGraduate grad = new CollegeGraduate("Bob Smith", "June 15, 1992", 3.75, 2014);
        System.out.println("\nCollege Graduate Name: " + grad.getName());
        System.out.println("College Graduate Birth Date: " + grad.getBirthDate());
        System.out.println("College Graduate GPA: " + grad.getGpa());
        System.out.println("College Graduate Graduation Year: " + grad.getGraduationYear());
    }

    // Person class
    public static class Person {
        // Private instance variables
        private String name;
        private String birthDate;

        // Constructor
        public Person(String name, String birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }

        // Accessor methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }
    }

    // CollegeGraduate class
    public static class CollegeGraduate extends Person {
        // Private instance variables
        private double gpa;
        private int graduationYear;

        // Constructor
        public CollegeGraduate(String name, String birthDate, double gpa, int graduationYear) {
            super(name, birthDate); // Call the constructor of the superclass (Person)
            this.gpa = gpa;
            this.graduationYear = graduationYear;
        }

        // Accessor methods
        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public int getGraduationYear() {
            return graduationYear;
        }

        public void setGraduationYear(int graduationYear) {
            this.graduationYear = graduationYear;
        }
    }
}
