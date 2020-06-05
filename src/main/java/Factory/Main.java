package Factory;

import Factory.abstractFactory.AudiFactory;
import Factory.abstractFactory.BMWengine;
import Factory.abstractFactory.BMWfactory;
import Factory.abstractFactory.Car;
import Factory.factoryMethod.GermanFactory;
import Factory.factoryMethod.PolishFactory;
import Factory.reflectionSimpleFactory.RefProduct;
import Factory.reflectionSimpleFactory.RefProductFactory;
import Factory.simpleFactory.Product;
import Factory.simpleFactory.ProductFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Long simpleFactoryTime;
        Long factoryMethodTime;
        Long abstractFactoryTime;
        Long refSimpleFactoryTime;

        //Simple Factory
        Long startTimeSF = System.nanoTime();
        ArrayList<Product> simpleFacObj = new ArrayList<Product>();
        ProductFactory simpleFactory = new ProductFactory();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            String[] typeArr = {"food", "agd"};
            int type = random.nextInt(typeArr.length);
            Product product = simpleFactory.createProduct(typeArr[type]);
            simpleFacObj.add(product);
        }
        System.out.println("Simple Factory (nano sec)");
        Long endTimeSF = System.nanoTime();
        simpleFactoryTime = endTimeSF - startTimeSF;
        System.out.println(simpleFactoryTime);

        //Factory method
        Long startTimeFM = System.nanoTime();
        ArrayList<Product> methodFacObj = new ArrayList<Product>();
        AbstractProductFactory abstractProductFactory;
        for (int i = 0; i < 1000; i++) {
            Random randomMethod = new Random();
            Random randomFactory = new Random();
            String[] typeArr = {"food", "agd"};
            int typeProduct = randomMethod.nextInt(typeArr.length);
            int typeFactory = randomFactory.nextInt(typeArr.length);

            if (typeFactory == 1) {
                abstractProductFactory = new PolishFactory();
                Product methodProduct = abstractProductFactory.createProduct(typeArr[typeProduct]);
                methodFacObj.add(methodProduct);
            } else {
                abstractProductFactory = new GermanFactory();
                Product methodProduct = abstractProductFactory.createProduct(typeArr[typeProduct]);
                methodFacObj.add(methodProduct);
            }
        }
        System.out.println("Factory Method (nano sec)");
        Long endTimeFM = System.nanoTime();
        factoryMethodTime = (endTimeFM - startTimeFM);
        System.out.println(factoryMethodTime);

        //Abstract factory
        Long startTimeAB = System.nanoTime();
        ArrayList<Car> abstractFacObj = new ArrayList<Car>();
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
            abstractFacObj.add(car);
        }
        System.out.println("Abstract Factory (nano sec)");
        Long endTimeAB = System.nanoTime();
        abstractFactoryTime = (endTimeAB - startTimeAB);
        System.out.println(abstractFactoryTime);

        //Reflection SimpleFactory
        Long startTimeRSF = System.nanoTime();
        ArrayList<RefProduct> refSimpleFactoryObj = new ArrayList<RefProduct>();
        RefProductFactory refProductFactory = new RefProductFactory();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            String[] typeArr = {"food", "agd"};
            int type = random.nextInt(typeArr.length);
            RefProduct refProduct = refProductFactory.createProduct(typeArr[type]);
            refSimpleFactoryObj.add(refProduct);
        }
        System.out.println("Reflection Simple Factory (nano sec)");
        Long endTimeRSF = System.nanoTime();
        refSimpleFactoryTime = endTimeRSF - startTimeRSF;
        System.out.println(refSimpleFactoryTime);
    }
}
