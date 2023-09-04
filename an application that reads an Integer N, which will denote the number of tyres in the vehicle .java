import java.util.Scanner;

class Vehicle {

}

class Car extends Vehicle {
    public void print() {
        System.out.println("This is a car");
    }
}

class Bike extends Vehicle {
    public void print() {
        System.out.println("This is a Bike");
    }
}

public class VehicleCarBike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no. of Tyres");
        n = sc.nextInt();
        switch (n) {
            case 2:
                Bike b = new Bike();
                b.print();
                break;
            case 4:
                Car c = new Car();
                c.print();
                break;

            default:
                System.out.println("Error");
                break;
        }
    }
}
