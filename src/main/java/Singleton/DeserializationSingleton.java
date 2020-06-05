package Singleton;

import org.apache.commons.lang.SerializationException;

import java.io.*;


public class DeserializationSingleton {

    public static void main(String[] args) throws SerializationException, IOException, ClassNotFoundException {

        Singleton instanceOne = Singleton.getInstance();
        instanceOne.setValue(2);
        System.out.println("Initial value: " + instanceOne.getValue());
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(instanceOne);
        out.close();

        instanceOne.setValue(1);

        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
        Singleton instanceTwo = (Singleton) in.readObject();
        in.close();
        System.out.println("Finish value: " + instanceTwo.getValue());
        System.out.println("Hashcode of Object 1 - " + instanceOne.hashCode());
        System.out.println("Hashcode of Object 2 - " + instanceTwo.hashCode());


    }
}
