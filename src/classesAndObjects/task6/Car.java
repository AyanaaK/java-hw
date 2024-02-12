package classesAndObjects.task6;

// Создайте класс, представляющий собой автомобиль.
// У автомобиля должны быть поля для модели, года выпуска и пробега.
// Напишите методы для установки и получения значений этих полей.
// Создайте объекты класса автомобиль и выведите их поля на экран.

public class Car {
    private String model;
    private int year;
    private int mileage;

    public Car(String model, int year, int mileage) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
