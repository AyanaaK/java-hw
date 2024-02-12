package classesAndObjects.task9;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point otherPoint) {
        double deltaX = otherPoint.x - this.x;
        double deltaY = otherPoint.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public boolean isOnLine(double a, double b) {
        return Math.abs(y - a * x - b) < 0.0001; // проверяем, лежит ли точка на прямой
    }
}
