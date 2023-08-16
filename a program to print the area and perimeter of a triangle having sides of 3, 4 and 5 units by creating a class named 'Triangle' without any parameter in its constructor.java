: import java.util.*;

class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;

    }
}

class Triangle {
    int side1;
    int side2;
    int side3;
    int height;
    int base;

    public void perimeter(int x, int y, int z) {
        this.side1 = x;
        this.side2 = y;
        this.side3 = z;
        System.out.println("The perimeter is " + side1 * side2 * side3);

    }

    public void area(int b, int h) {
        this.base = b;
        this.height = h;
        // float area = (int) (1 / 2 * b * h);
        System.out.println("The area is " + 0.5 * b * h);
    }

}

public class strart {

    public static void main(String[] args) {
        // Student s1 = new Student("john", 2);
        // System.out.println(s1.name);
        // System.out.println(s1.rollno);
        Triangle t1 = new Triangle();
        System.out.println("Enter the sides or triangle");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        t1.perimeter(x, y, z);
        System.out.println("Enter the height and base of triangle");
        int b = sc.nextInt();
        int h = sc.nextInt();
        t1.area(b, h);

    }

}
