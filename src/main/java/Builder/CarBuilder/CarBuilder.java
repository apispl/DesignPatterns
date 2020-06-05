package Builder.CarBuilder;

import Builder.Entities.Car;

public interface CarBuilder {
    void buildBody();

    void buildEngine();

    Car getCar();
}
