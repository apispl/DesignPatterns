package Prototype;

public class Chicken implements Farm {
    private String name = "Parker";
    private Animal animal;

    public Chicken(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Chicken clone() throws CloneNotSupportedException {
        System.out.println("Clone of Parker Chicken");
        return (Chicken) super.clone();
    }

    @Override
    public String toString() {
        return "|Chicken name: " + name + " |Chicken animal: " + animal.toString();
    }
}
