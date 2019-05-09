package be.intecBrussel.Object_serialization.Opdracht7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ReadContext {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("Drawing.ser");
            ObjectInputStream in = new ObjectInputStream(file)){

            Drawing drawing = (Drawing) in.readObject();
            System.out.println(drawing);
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
