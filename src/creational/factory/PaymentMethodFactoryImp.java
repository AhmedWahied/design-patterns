package creational.factory;


public class PaymentMethodFactoryImp implements PayMethodFactory {
    @Override
    public Pay getPayMethod(String type) {

        return switch (type) {
            case "CC" -> new PayCC();
            case "WALLET" -> new PayWallet();
            case "CASH" -> new PayCash();
            default -> null;
        };
    }
}
