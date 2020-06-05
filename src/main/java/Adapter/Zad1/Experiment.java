package Adapter.Zad1;

public class Experiment {
    public static void main(String[] args) {

        //NO ADAPTER
        System.out.println("Experiment 1: test the aircraft engine");
        IAircraft airCraft = new Aircraft();
        airCraft.TakeOff();
        if (airCraft.Airborne()){
            System.out.println("The aircraft engine is fine, flying at "  + airCraft.height() + "meters\n");
        }
        System.out.println("AirCraft: " + airCraft + "\n");

        //Classic usage of an adapter
        System.out.println("Experiment 2: Use the engine in the Seabird");
        IAircraft seabird = new SeaBird();
        seabird.TakeOff(); // And automatically increases speed
        System.out.println("The Seabird took off\n");
        System.out.println("SeaBird:" + seabird + "\n");

        //TWO WAY ADAPTER
        System.out.println("Experiment 3: Increase the speed of the Seabird:");
        IAircraft seabirdNew = (IAircraft) seabird;
//        ISeacraft seabirdNew = (ISeacraft) seabird;
        seabirdNew.IncreaseRevs();
        seabirdNew.IncreaseRevs();
        if (seabird.Airborne()){
            System.out.println("Seabird flying at height " + seabird.height() +
                    " meters and speed " + seabirdNew.Speed() + " knots");
            System.out.println("Experiments successful; the Seabird flies!\n");
        }

        System.out.println("SeaBirdNewSuperClass: " + seabirdNew.getClass().getSuperclass() + "\n");
    }
}
