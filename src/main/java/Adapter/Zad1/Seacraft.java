package Adapter.Zad1;

public class Seacraft implements ISeacraft {
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
