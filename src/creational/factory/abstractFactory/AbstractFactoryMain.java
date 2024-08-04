package creational.factory.abstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        PayFactory factory = new PaymentMethodFactoryImp();
        Pay payMethod = factory.getPayMethod("CASH");
        payMethod.pay();
      Merchant merchant =  factory.getMerchant("VISA");
        merchant.getMerchantData();
        Pay payMethod1 = factory.getPayMethod("CC");
        payMethod1.pay();

        Pay payMethod2 = factory.getPayMethod("WALLET");
        payMethod2.pay();

    }
}
