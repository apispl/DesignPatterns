package Factory.abstractFactory;

public class BMWbody implements Body {
    @Override
    public void assembly() {
        System.out.println("Montuję karoserię BWM...");
    }
}
