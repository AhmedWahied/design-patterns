package creational.builder;

public class CarProduct implements ProductBuilder {

    private Product product;

    public CarProduct() {
        this.product = new Product();
    }

    @Override
    public void initID() {
        product.setId(1);
    }

    @Override
    public void addColor() {
        product.setColor("red");
    }

    @Override
    public void addName() {
        product.setName("Car");
    }

    @Override
    public void addPrice() {
        product.setPrice(5000.0);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
