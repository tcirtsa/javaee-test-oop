package cn.zust.edu.cn;

import java.util.List;

public class ShapeManager {
    List<IShape> shapes;
    public ShapeManager() {
        shapes = new java.util.ArrayList<>();
    }

    public void addShape(IShape shape) {
        shapes.add(shape);
    }

    public void delShape(IShape shape) {
        shapes.remove(shape);
    }

    public void drawShapes() {
        for (IShape shape : shapes) {
            shape.draw();
        }
    }
}
