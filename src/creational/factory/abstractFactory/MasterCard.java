package creational.factory.abstractFactory;


public class MasterCard implements Merchant {
    @Override
    public void getMerchantData() {
        System.out.println("Merchant Name: " );
    }
}
