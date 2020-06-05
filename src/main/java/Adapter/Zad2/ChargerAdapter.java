package Adapter.Zad2;

import Adapter.OtherCharger.UsaCharger;

public class ChargerAdapter implements Charger {

    UsaCharger usaCharger = new UsaCharger();

    @Override
    public void plugInCharger(String str) {
        usaCharger.plugInUsaCharger(str);
    }
}
