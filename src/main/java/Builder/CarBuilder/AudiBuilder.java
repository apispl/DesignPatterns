package Builder.CarBuilder;

import Builder.Entities.Body;
import Builder.Entities.Car;
import Builder.Entities.Engine;

public class AudiBuilder implements CarBuilder {

    private Car car;

    public AudiBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildBody() {
        Body body = new Body();
        body.setSize(1);
        body.setType("racing");
        car.setBody(body);

    }

    @Override
    public void buildEngine() {
        Engine engine = new Engine();
        engine.setType("v6");
        engine.setHorsePower(120);
        car.setEngine(engine);
    }

    @Override
    public Car getCar() {
        return car;
    }
}
