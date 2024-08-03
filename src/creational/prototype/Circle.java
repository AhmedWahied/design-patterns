package creational.prototype;

public class Circle extends Shape {

    public double radius;
    public ShapeData shapeData;

    public Circle() {
    }

    public Circle(double radius, String color, String name, ShapeData shapeData) {
        this.radius = radius;
        this.color = color;
        this.name = name;
        this.shapeData = shapeData;
    }

    //copy constructor
    public Circle(Circle circle) {
        this.radius = circle.radius;
        this.color = circle.color;
        this.name = circle.name;
        this.shapeData = circle.shapeData;
    }

    @Override
    public Shape shallowClone() {
        return new Circle(this);
    }

    @Override
    public Shape deepClone() {
        return new Circle(this.radius,
                this.color,
                this.name,
                new ShapeData(this.shapeData.height, this.shapeData.weight));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", shapeData=" + shapeData +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
