package Prototype;

public class Horse implements Farm {
    private String name = "Filip";
    private Animal animal;

    public Horse(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Horse clone() throws CloneNotSupportedException {
        System.out.println("Clone of Filip Horse");
        return (Horse) super.clone();
    }

    @Override
    public String toString() {
        return "|Horse name: " + name + " |Horse animal: " + animal.toString();
    }
}
