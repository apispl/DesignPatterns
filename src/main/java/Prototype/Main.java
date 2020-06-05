package Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        FarmFactory farmFactory = new FarmFactory();

        farmFactory.putAnimals();

        farmFactory.cloneAnimals();
    }
}
