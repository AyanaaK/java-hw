package classesAndObjects.task7;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(2.3, 1.9);
        Circle c1 = new Circle(5.0, p1, 3.14);

        double resultArea = c1.getArea();
        double resultCir = c1.getCircumference();
        double allResults = resultArea + resultCir;

        System.out.println(resultArea);
        System.out.println(resultCir);
        System.out.println(allResults);
    }

}
