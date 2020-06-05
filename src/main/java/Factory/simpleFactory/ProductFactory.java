package Factory.simpleFactory;

public class ProductFactory {
    public static ProductFactory instance;

    public ProductFactory getInstance() {
        if (instance == null) {
            instance = new ProductFactory();
        }
        return instance;
    }

    public Product createProduct(String type) {
        Product product;
        if (type.equals("food")) {
            product = new ProductFood();
        } else {
            product = new ProductAGD();
        }
        return product;
    }
}
