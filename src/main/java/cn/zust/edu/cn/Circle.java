package cn.zust.edu.cn;

public class Circle implements IShape {
    private Point ptCenter;
    private int radius;

    public Circle(Point center, int r) {
        this.ptCenter = center;
        this.radius = r;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing circle");
    }
}