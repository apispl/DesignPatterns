package Prototype;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FarmFactoryTest {

    @Test
    void farmFactoryCloningTest() throws CloneNotSupportedException {
        HashMap<String, Farm> farm = new HashMap<>();
        HashMap<String, Farm> cloneFarm = new HashMap<>();

        farm.put("Owca", new Sheep(new Animal("wełniane", 5, new Creature(4, false))));
        farm.put("Koń", new Horse(new Animal("czterokopytne", 8, new Creature(4, false))));
        farm.put("Kurczak", new Chicken(new Animal("ptaki", 1, new Creature(2, true))));

        cloneFarm.put("Owca", farm.get("Owca").clone());
        cloneFarm.put("Koń", farm.get("Koń").clone());
        cloneFarm.put("Kurczak", farm.get("Kurczak").clone());

        assertNotEquals(farm.get("Owca"), cloneFarm.get("Owca"));
        assertNotEquals(farm.get("Koń"), cloneFarm.get("Koń"));
        assertNotEquals(farm.get("Kurczak"), cloneFarm.get("Kurczak"));

        assertEquals(farm.get("Owca").toString(), cloneFarm.get("Owca").toString());
        assertEquals(farm.get("Koń").toString(), cloneFarm.get("Koń").toString());
        assertEquals(farm.get("Kurczak").toString(), cloneFarm.get("Kurczak").toString());
    }
}
