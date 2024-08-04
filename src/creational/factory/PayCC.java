package creational.factory;

public class PayCC implements Pay{
    @Override
    public void pay() {
        System.out.println("pay using Credit Card ");
    }
}
