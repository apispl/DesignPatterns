package Factory.abstractFactory;

public class Car {
    private Engine engine;
    private Body body;

    public Car(CarFactory carFactory) {
        engine = carFactory.createEngine();
        body = carFactory.createBody();
    }

}
