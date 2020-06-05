package Builder.CarBuilder;

import Builder.Entities.Body;
import Builder.Entities.Car;
import Builder.Entities.Engine;

public class BmwBuilder implements CarBuilder {

    private Car car;

    public BmwBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildBody() {
        Body body = new Body();
        car.setBody(body);
    }

    @Override
    public void buildEngine() {
        Engine engine = new Engine();
        car.setEngine(engine);
    }

    @Override
    public Car getCar() {
        return car;
    }
}
