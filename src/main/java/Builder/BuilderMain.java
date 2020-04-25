package Builder;

import Builder.CarBuilder.AudiBuilder;
import Builder.CarBuilder.BmwBuilder;
import Builder.CarBuilder.CarBuilder;
import Builder.CarBuilder.CarEngineer;
import Builder.CarFactoryAbstract.AudiFactory;
import Builder.CarFactoryAbstract.BMWfactory;
import Builder.CarFactoryAbstract.Car;

import java.util.ArrayList;
import java.util.Random;

public class BuilderMain {
    public static void main(String[] args) {

        //CarBuilder
        Long startTimeCB = System.nanoTime();
        CarBuilder carBuilder;
        CarEngineer carEngineer = new CarEngineer();
        ArrayList<Builder.Entities.Car> carBuilderObj = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Random randomFactory = new Random();
            String[] typeArr = {"bmw", "audi"};
            int typeCarFactory = randomFactory.nextInt(typeArr.length);
            Builder.Entities.Car car;
            if (typeCarFactory == 1) {
                carBuilder = new AudiBuilder();
                carEngineer.produceCar(carBuilder);
                car = carBuilder.getCar();

            } else {
                carBuilder = new BmwBuilder();
                carEngineer.produceCar(carBuilder);
                car = carBuilder.getCar();

            }
            carBuilderObj.add(car);
        }
        System.out.println("Builder (nano sec)");
        Long endTimeCB = System.nanoTime();
        long carBuilderTime = (endTimeCB - startTimeCB);
        System.out.println(carBuilderTime);

        //CarFactoryAbstract
        Long startTimeCFA = System.nanoTime();
        ArrayList<Car> carAbstractFacObj = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Car car;
            Random randomFactory = new Random();
            String[] typeArr = {"bmw", "audi"};
            int typeCarFactory = randomFactory.nextInt(typeArr.length);

            if (typeCarFactory == 1) {
                car = new Car(new BMWfactory());
            } else {
                car = new Car(new AudiFactory());

            }
            carAbstractFacObj.add(car);
        }
        System.out.println("Abstract Factory (nano sec)");
        Long endTimeCFA = System.nanoTime();
        long carAbstractFacTime = (endTimeCFA - startTimeCFA);
        System.out.println(carAbstractFacTime);
    }
}
