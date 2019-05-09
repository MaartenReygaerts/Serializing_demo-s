package be.intecBrussel.Object_serialization.Opdracht8_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CarWriter {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("Car.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            System.out.println("Starting serializing process....");
            Car nissan = new Car("Nissan",240,1.50);

            oos.writeObject(nissan);

        }catch (FileNotFoundException fe){
            System.out.println("File does not exist " + fe.getMessage());
        }catch (IOException e){
            System.out.println("Whoops, IOExeption" + e.getMessage());
        }finally {
            System.out.println("Finished our serializing process...");
        }
    }
}
