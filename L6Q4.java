// Base class
class Building {
    private double squareFootage;
    private int stories;

    // Constructor
    public Building(double squareFootage, int stories) {
        this.squareFootage = squareFootage;
        this.stories = stories;
    }

    // Getter and Setter for squareFootage
    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    // Getter and Setter for stories
    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }

    @Override
    public String toString() {
        return "Building{" +
                "squareFootage=" + squareFootage +
                ", stories=" + stories +
                '}';
    }
}

// Subclass House
class House extends Building {
    private int numberOfBedrooms;
    private int numberOfBaths;

    // Constructor
    public House(double squareFootage, int stories, int numberOfBedrooms, int numberOfBaths) {
        super(squareFootage, stories);
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBaths = numberOfBaths;
    }

    // Getter and Setter for numberOfBedrooms
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    // Getter and Setter for numberOfBaths
    public int getNumberOfBaths() {
        return numberOfBaths;
    }

    public void setNumberOfBaths(int numberOfBaths) {
        this.numberOfBaths = numberOfBaths;
    }

    @Override
    public String toString() {
        return "House{" +
                "squareFootage=" + getSquareFootage() +
                ", stories=" + getStories() +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBaths=" + numberOfBaths +
                '}';
    }
}

// Subclass School
class School extends Building {
    private int numberOfClassrooms;
    private String gradeLevel;

    // Constructor
    public School(double squareFootage, int stories, int numberOfClassrooms, String gradeLevel) {
        super(squareFootage, stories);
        this.numberOfClassrooms = numberOfClassrooms;
        this.gradeLevel = gradeLevel;
    }

    // Getter and Setter for numberOfClassrooms
    public int getNumberOfClassrooms() {
        return numberOfClassrooms;
    }

    public void setNumberOfClassrooms(int numberOfClassrooms) {
        this.numberOfClassrooms = numberOfClassrooms;
    }

    // Getter and Setter for gradeLevel
    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "School{" +
                "squareFootage=" + getSquareFootage() +
                ", stories=" + getStories() +
                ", numberOfClassrooms=" + numberOfClassrooms +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create a Building object
        Building building = new Building(5000.0, 3);
        System.out.println(building);

        // Create a House object
        House house = new House(2500.0, 2, 4, 3);
        System.out.println(house);

        // Create a School object
        School school = new School(10000.0, 4, 20, "Elementary");
        System.out.println(school);
    }
}
