package creational.prototype;

public abstract class Shape {
    String color;
    String name;

    public abstract Shape shallowClone() ;
    public abstract Shape deepClone() ;

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
