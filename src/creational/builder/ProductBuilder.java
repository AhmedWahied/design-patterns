package creational.builder;

public interface ProductBuilder {
    void initID();

    void addColor();

    void addName();

    void addPrice();

    Product getProduct();
}
