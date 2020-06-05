package Factory;

import Factory.simpleFactory.Product;

public abstract class AbstractProductFactory {
    protected abstract Product createProduct(String type);
}
