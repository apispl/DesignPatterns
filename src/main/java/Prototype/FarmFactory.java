package Prototype;

import java.util.HashMap;
import java.util.Map;

public class FarmFactory {
    private static HashMap<String, Farm> farm = new HashMap<>();
    private static HashMap<String, Farm> cloneFarm = new HashMap<>();

    public void putAnimals() {

        farm.put("Owca", new Sheep(new Animal("wełniane", 5, new Creature(4, false))));
        farm.put("Koń", new Horse(new Animal("czterokopytne", 8, new Creature(4, false))));
        farm.put("Kurczak", new Chicken(new Animal("ptaki", 1, new Creature(2, true))));
        System.out.println("Animals in box: " + farm);

        for (Map.Entry<String, Farm> entry : farm.entrySet()) {
            Farm farm = entry.getValue();
            String key = entry.getKey();
            System.out.println("Key: " + key + " Value: " + farm.toString());
        }
    }

    public void cloneAnimals() throws CloneNotSupportedException {
        cloneFarm.put("Owca", farm.get("Owca").clone());
        cloneFarm.put("Koń", farm.get("Koń").clone());
        cloneFarm.put("Kurczak", farm.get("Kurczak").clone());
        System.out.println("Animals Clones in box: " + cloneFarm);

        for (Map.Entry<String, Farm> entry : cloneFarm.entrySet()) {
            Farm farm = entry.getValue();
            String key = entry.getKey();
            System.out.println("Key: " + key + " Value: " + farm.toString());
        }
    }

}
