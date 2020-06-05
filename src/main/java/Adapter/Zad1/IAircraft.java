package Adapter.Zad1;

public interface IAircraft {
    boolean Airborne();
    void TakeOff();
    int height();

    //do zmiany
    int Speed();
    void IncreaseRevs();
}
