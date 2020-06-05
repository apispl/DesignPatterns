package Factory.abstractFactory;

public interface CarFactory {
    public Engine createEngine();

    public Body createBody();
}
