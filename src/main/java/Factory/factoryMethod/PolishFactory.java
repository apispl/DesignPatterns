package Factory.factoryMethod;

import Factory.AbstractProductFactory;
import Factory.simpleFactory.Product;

public class PolishFactory extends AbstractProductFactory {

    @Override
    protected Product createProduct(String type) {
        Product product;
        if (type.equals("food")) {
            product = new PolishProductFood();
        } else {
            product = new PolishProductAGD();
        }
        return product;
    }
}
