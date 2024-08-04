package creational.factory.abstractFactory;

public class Visa implements Merchant{
    @Override
    public void getMerchantData() {
        System.out.println("VISA");
    }
}
