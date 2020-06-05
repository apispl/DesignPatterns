package Factory.reflectionSimpleFactory;

import Factory.simpleFactory.Product;
import Factory.simpleFactory.ProductAGD;
import Factory.simpleFactory.ProductFood;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RefProductFactory {
    public static RefProductFactory instance;

    public RefProductFactory getInstance() {
        if (instance == null) {
            instance = new RefProductFactory();
        }
        return instance;
    }

    public RefProduct createProduct(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        RefProduct refProductReturn;
        if (type.equals("food")) {
            Class refProductClass = RefProductFood.class;
            refProductReturn = (RefProduct) refProductClass.newInstance();
        } else {
            Class refProductClass = RefProductAGD.class;
            refProductReturn = (RefProduct) refProductClass.newInstance();
        }
        return refProductReturn;
    }
}
