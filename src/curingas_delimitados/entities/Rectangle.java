package curingas_delimitados.entities;

public class Rectangle implements Shape {
    private double width, height;

    public Rectangle(double sideA, double height) {
        this.width = sideA;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }
}
