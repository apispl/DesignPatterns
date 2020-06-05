package Singleton;

import java.io.Serializable;


public class Singleton implements Serializable {
    public static Object instance;
    private static Singleton INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Singleton() {
    }

    public static Singleton getInstance() { //threads
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    protected Object readResolve() {
        INSTANCE.setValue(getValue());
        return INSTANCE;
    }


//    protected static volatile Singleton instance;
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() { //threads
//        if(instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

}
