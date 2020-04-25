package Builder.CarFactoryAbstract;

public class BMWengine implements Engine {
    private String type;
    private int horsePower;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void assembly() {
        System.out.println("Montuje silnik BWM...");
    }
}
