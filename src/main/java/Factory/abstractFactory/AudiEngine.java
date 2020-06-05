package Factory.abstractFactory;

public class AudiEngine implements Engine {
    @Override
    public void assembly() {
        System.out.println("Montuję silnik Audi...");
    }
}
