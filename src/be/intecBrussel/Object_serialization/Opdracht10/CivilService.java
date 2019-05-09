package be.intecBrussel.Object_serialization.Opdracht10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CivilService {
    public static void main(String[] args) {

        try (FileInputStream file = new FileInputStream("Maarten.ser");
             ObjectInputStream in = new ObjectInputStream(file)){

            Person persoon = (Person) in.readObject();

            System.out.println(persoon.getFirstname());
            System.out.println(persoon.getLastname());
            System.out.println(persoon.getBirthDay());
            System.out.println(persoon.getBirthPlace());



        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
