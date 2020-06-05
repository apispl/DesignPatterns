package Factory.abstractFactory;

public class AudiBody implements Body {
    @Override
    public void assembly() {
        System.out.println("Montuję karoserię Audi...");
    }
}
