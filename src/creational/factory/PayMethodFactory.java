package creational.factory;

public interface PayMethodFactory {
    Pay getPayMethod(String type);
}
