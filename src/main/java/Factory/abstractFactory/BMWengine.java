package Factory.abstractFactory;

public class BMWengine implements Engine {
    @Override
    public void assembly() {
        System.out.println("Montuje silnik BWM...");
    }
}
