package be.intecBrussel.Object_serialization.Opdracht8_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarReader {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("Car.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            System.out.println("Started deserializing...");
            Car nissan = (Car) ois.readObject();
            System.out.println(nissan);
            System.out.println("Number of wheels: " + nissan.getNumberWheels());
            nissan.newFeatures();
            System.out.println("Finished desirializing process...");

        } catch (FileNotFoundException fe) {
            System.out.println("File was not found " + fe.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Whoops, ioExeption " + e.getMessage());
        }
    }
}
