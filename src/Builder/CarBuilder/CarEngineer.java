package Builder.CarBuilder;

import Builder.Entities.Car;

public class CarEngineer {
    private CarBuilder carBuilder;

    public CarEngineer() {
    }

    public CarEngineer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void produceCar(CarBuilder carBuilder){
        carBuilder.buildBody();
        carBuilder.buildEngine();
    }

    public Car getCar(){
        return this.carBuilder.getCar();
    }
}
