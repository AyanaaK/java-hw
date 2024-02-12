package classesAndObjects.task6;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Honda Civic", 2022, 30000);
        car1.setMileage(35000);
        System.out.println("Car model is: " + car1.getModel());
        System.out.println("Car year is: " + car1.getYear());
        System.out.println("Car mileage is: " + car1.getMileage());
    }
}
