import java.util.*;

class Area {
    int l, b, l2, b2;

    Area(int l, int b, int l2, int b2) {
        this.l = l;
        this.b = b;
    }

    public int rec1(int l, int b) {
        return l * b;

    }

}

public class qs {
    public static void main(String[] args) {
        Area rec = new Area(4, 5);
        System.out.println("The area is " + rec.rec1(4, 5));

    }

}
