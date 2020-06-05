package Adapter.Zad1;

//Seacfart zmiana na Aircraft
public class SeaBird extends Aircraft implements IAircraft {

    int height = 0;

    @Override
    public boolean Airborne() {
        return height > 50;
    }

    @Override
    public void TakeOff() {
        while (!Airborne()){
            IncreaseRevs();
            System.out.println(height);
        }
    }

    @Override
    public void IncreaseRevs(){
        super.IncreaseRevs();
        speed += 10;
        System.out.println("Seacraft engine increases revs to " + speed + " knots");
        if (Speed() > 40) {
            height += 100;
        }
    }

    @Override
    public int height() {
        return height;
    }

}
