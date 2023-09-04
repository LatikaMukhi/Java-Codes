abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape {
    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
System.out.println("The area of the rectangle is: " + area);
    }

    void SquareArea(double side) {
        double area = side * side;
System.out.println("The area of the square is: " + area);
    }

    void CircleArea(double radius) {
        double area = Math.PI * radius * radius;
System.out.println("The area of the circle is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Area a = new Area();
a.RectangleArea(5, 10);
a.SquareArea(6);
a.CircleArea(7);
    }
}
