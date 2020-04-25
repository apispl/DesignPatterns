package Builder.CarBuilder;

import Builder.Entities.Car;

public interface CarBuilder {
    public void buildBody();
    public void buildEngine();

    public Car getCar();
}
