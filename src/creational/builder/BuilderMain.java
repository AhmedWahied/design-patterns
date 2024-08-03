package creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        ProductBuilder builder = new CarProduct();
        ProductDirector director = new ProductDirector(builder);
        Product product = director.buildProduct();
        System.out.println(product);
    }
}
