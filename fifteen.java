
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    
    public double calculateArea() {
        return 0.0;
    }

    
    public double calculatePerimeter() {
        return 0.0;
    }
}

class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0);
        this.radius = radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    
    public double calculateArea() {
        return length * width;
    }

   
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class fifteen {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Circle Details:");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + String.format("%.2f", circle.calculateArea()));
        System.out.println("Perimeter: " + String.format("%.2f", circle.calculatePerimeter()));

        System.out.println("\nRectangle Details:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + String.format("%.2f", rectangle.calculateArea()));
        System.out.println("Perimeter: " + String.format("%.2f", rectangle.calculatePerimeter()));
    }
}
