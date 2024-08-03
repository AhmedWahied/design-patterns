package creational.builder;

public class ProductDirector {
    ProductBuilder productBuilder;

    public ProductDirector(ProductBuilder builder) {
        productBuilder = builder;
    }

    public Product buildProduct() {
        productBuilder.addColor();
        productBuilder.addName();
        productBuilder.addPrice();
        productBuilder.initID();
        return productBuilder.getProduct();
    }
}
