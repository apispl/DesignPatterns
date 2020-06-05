package Adapter.Zad2;

public class HotelSocket {

    private Charger charger;

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    public void plugIn(String str){
        charger.plugInCharger(str);
    }
}
