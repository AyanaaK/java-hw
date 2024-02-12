package classesAndObjects.task7;

//        Создайте класс, представляющий собой круг.
//        У круга должны быть поля для радиуса и центра.
//        Напишите методы для вычисления площади и длины окружности круга.
//        Создайте объекты класса круг и выведите на экран их параметры и вычисленные значения.

public class Circle {
    private double radius;
    private Point center;
    private double pi;

    public Circle(double radius, Point center, double pi) {
        this.radius = radius;
        this.center = center;
        this.pi = pi;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public double getCircumference() {
        return 2 * pi * radius;
    }

}