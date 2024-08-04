package creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        PayMethodFactory factory = new PaymentMethodFactoryImp();
        Pay payMethod = factory.getPayMethod("CASH");
        payMethod.pay();

        Pay payMethod1 = factory.getPayMethod("CC");
        payMethod1.pay();

        Pay payMethod2 = factory.getPayMethod("WALLET");
        payMethod2.pay();

    }
}
