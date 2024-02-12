package classesAndObjects.task1;

public class Car {
    public String brand;
    public String model;
    public double speed;

    public void start() {
        System.out.println("Машина " + brand + " " + model + " со скоростью " + speed + " поехала.");
    }

    public void stop() {
        System.out.println("Машина " + brand + " " + model + " со скоростью " + speed + " остановилась.");
    }
}
