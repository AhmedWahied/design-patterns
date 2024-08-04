package creational.factory.abstractFactory;


public class PaymentMethodFactoryImp implements PayFactory {
    @Override
    public Pay getPayMethod(String type) {

        return switch (type) {
            case "CC" -> new PayCC();
            case "WALLET" -> new PayWallet();
            case "CASH" -> new PayCash();
            default -> null;
        };
    }

    @Override
    public Merchant getMerchant(String merchantName) {
        return switch (merchantName) {
            case "VISA" -> new Visa();
            case "MASTER_CARD" -> new MasterCard();
            default -> null;
        };
    }
}
