

package Solid_Principle;

/**
 * Abstract base class representing a shape.
 */
public abstract class Shape {
    /**
     * Draws the shape. This method is implemented by subclasses.
     */
    public abstract void draw();
}

public class Circle extends Shape {
    private double radius;

    /**
     * Constructs a new Circle with the specified radius.
     *
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Draws the circle shape.
     */
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
}
public class Rectangle extends Shape {
    private double length;
    private double width;

    /**
     * Constructs a new Rectangle with specified length and width.
     *
     * @param length the length of the rectangle
     * @param width  the width of the rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Draws the rectangle shape.
     */
    
    public void draw() {
        System.out.println("Drawing a rectangle with length: " + length + " and width: " + width);
    }
}
