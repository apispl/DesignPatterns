package Builder.CarFactoryAbstract;

public class AudiBody implements Body {
    private String type;
    private int size;

    @Override
    public void assembly() {
        System.out.println("Montuję karoserię Audi...");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
