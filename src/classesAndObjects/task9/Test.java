package classesAndObjects.task9;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(4.0, 6.0);

        System.out.println("Distance between p1 and p2: " + p1.distanceTo(p2));

        double a = 2.0;
        double b = 1.0;
        System.out.println("p1 is on line y = " + a + "x + " + b + ": " + p1.isOnLine(a, b));
    }
}
