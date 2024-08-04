package creational.factory.abstractFactory;

public class PayWallet implements Pay {
    @Override
    public void pay() {
        System.out.println("pay Using Wallet");
    }
}
