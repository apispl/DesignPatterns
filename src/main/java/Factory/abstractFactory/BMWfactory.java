package Factory.abstractFactory;

public class BMWfactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new BMWengine();
    }

    @Override
    public Body createBody() {
        return new BMWbody();
    }
}
