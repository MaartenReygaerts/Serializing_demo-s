package be.intecBrussel.Object_serialization.Opdracht6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Maternity {
    public static void main(String[] args) {

        Person persoon = new Person("Maarten","Reygaerts", LocalDate.of(1997,07,12));

        try(FileOutputStream file = new FileOutputStream(persoon.getFirstname() + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(file)){
            out.writeObject(persoon);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
