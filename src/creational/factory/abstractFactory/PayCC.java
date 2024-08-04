package creational.factory.abstractFactory;

public class PayCC implements Pay {
    @Override
    public void pay() {
        System.out.println("pay using Credit Card ");
    }
}
