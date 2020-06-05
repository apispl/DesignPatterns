package Factory.factoryMethod;

import Factory.AbstractProductFactory;
import Factory.simpleFactory.Product;

public class GermanFactory extends AbstractProductFactory {

    @Override
    protected Product createProduct(String type) {
        Product product;
        if (type.equals("food")) {
            product = new GermanProductFood();
        } else {
            product = new GermanProductAGD();
        }
        return product;
    }
}
