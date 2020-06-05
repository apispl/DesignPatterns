package Prototype;

public class Sheep implements Farm {
    private String name = "Dolly";
    private Animal animal;

    public Sheep(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() throws CloneNotSupportedException {
        System.out.println("Clone of Dolly Sheep");
        return (Sheep) super.clone();
    }

    @Override
    public String toString() {
        return "|Sheep name: " + name + " |Sheep animal: " + animal.toString();
    }

}
