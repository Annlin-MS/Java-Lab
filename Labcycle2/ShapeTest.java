interface Shape {
    double calculateArea();
}

class Triangle implements Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(10, 5);
        Shape shape2 = new Rectangle(4, 6);
        
        System.out.println("Triangle Area: " + shape1.calculateArea());
        System.out.println("Rectangle Area: " + shape2.calculateArea());
    }
}
