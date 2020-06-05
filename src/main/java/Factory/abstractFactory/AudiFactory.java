package Factory.abstractFactory;

public class AudiFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new AudiEngine();
    }

    @Override
    public Body createBody() {
        return new AudiBody();
    }
}
