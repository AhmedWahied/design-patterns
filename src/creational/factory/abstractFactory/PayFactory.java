package creational.factory.abstractFactory;

public interface PayFactory {
    Pay getPayMethod(String type);
    Merchant getMerchant(String merchantName);
}
