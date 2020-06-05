package Prototype;

public class Creature {
    private int legs;
    private boolean wings;

    public Creature(int legs, boolean wings) {
        this.legs = legs;
        this.wings = wings;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isWings() {
        return wings;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }

    @Override
    public String toString() {
        return "legs: " + legs + " wings: " + wings + "}";
    }
}
