package Adapter.Zad1;

public class Aircraft implements IAircraft {
    int height;
    boolean airborne;

    public Aircraft(){
        height = 0;
        airborne = false;
    }

    @Override
    public boolean Airborne() {
        return airborne;
    }

    @Override
    public void TakeOff() {
        System.out.println("Aircraft engine takeoff");
        airborne = true;
        height = 200;
    }

    @Override
    public int height() {
        return height;
    }

    //do zmiany
    int speed = 0;

    @Override
    public void IncreaseRevs() {
        speed += 10;
        System.out.println("Seacraft engine increases revs to " + speed + " knots");
    }

    @Override
    public int Speed(){
        return speed;
    }
}
