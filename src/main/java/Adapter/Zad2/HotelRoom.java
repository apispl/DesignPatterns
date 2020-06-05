package Adapter.Zad2;

import Adapter.OtherCharger.UsaCharger;

public class HotelRoom {
    public static void main(String[] args) {

//        UsaCharger usaCharger = new UsaCharger();
        Charger charger = new ChargerAdapter();
        HotelSocket hotelSocket = new HotelSocket();
        hotelSocket.setCharger(charger);
        hotelSocket.plugIn("Wtyczka pasuje!");

    }
}
