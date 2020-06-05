package Prototype;

public class Animal {
    private String group;
    private int age;
    private Creature creature;

    public Animal(String group, int age, Creature creature) {
        this.group = group;
        this.age = age;
        this.creature = creature;
    }

    @Override
    public String toString() {
        return "Animal{" + "group: " + group + " age: " + age + " Creature[" + creature.toString() + "]}";
    }
}
