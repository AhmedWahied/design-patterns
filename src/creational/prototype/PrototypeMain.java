package creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0,"red","circle1",new ShapeData(1,2));
        System.out.println("circle class :: "+circle);
        System.out.println("shapeData class :: "+circle.shapeData);
        Circle circle2 = (Circle)circle.shallowClone();
        System.out.println(circle2);
        System.out.println(circle2.shapeData);
        Circle circle3 = (Circle)circle.deepClone();
        System.out.println(circle3);
        System.out.println(circle3.shapeData);

    }
}
