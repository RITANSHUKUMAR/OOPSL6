// Abstract class Figure
abstract class Figure {
    int dimension1;
    int dimension2;

    Figure(int dim1, int dim2) {
        this.dimension1 = dim1;
        this.dimension2 = dim2;
    }

    // Abstract method to be implemented by subclasses
    abstract double area();
}

// Class Rectangle extending Figure
class Rectangle extends Figure {
    Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    double area() {
        return dimension1 * dimension2;
    }
}

// Class Triangle extending Figure
class Triangle extends Figure {
    Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * dimension1 * dimension2;
    }
}

// Class Square extending Figure
class Square extends Figure {
    Square(int side) {
        super(side, side);
    }

    @Override
    double area() {
        return dimension1 * dimension2;
    }
}

// Main class to demonstrate dynamic polymorphism
public class Main {
    public static void main(String[] args) {
        // Create instances of Rectangle, Triangle, and Square
        Figure rect = new Rectangle(5, 10);
        Figure tri = new Triangle(6, 8);
        Figure sq = new Square(4);

        // Compute and print the areas dynamically
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());
        System.out.println("Area of Square: " + sq.area());
    }
}
