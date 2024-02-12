package classesAndObjects.task1;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Kia";
        car1.model = "K5";
        car1.speed = 200.0;
        car1.start();
        car1.stop();

        Car car2 = new Car();
        car2.brand = "Mercedes-Benz";
        car2.model = "GLE Coupe";
        car2.speed = 250.0;
        car2.start();
        car2.stop();
    }
}
