package creational.factory;

public class PayCash implements Pay{
    @Override
    public void pay() {
        System.out.println("pay in cash");
    }
}
