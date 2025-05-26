package curingas_delimitados.application;

import curingas_delimitados.entities.Circle;
import curingas_delimitados.entities.Rectangle;
import curingas_delimitados.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3.0, 2.0));
        shapes.add(new Circle(2.0));

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(3.0));
        circles.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(circles));
    }
    public static double totalArea(List<? extends Shape> shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.area();
        }
        return area;
    }
}
