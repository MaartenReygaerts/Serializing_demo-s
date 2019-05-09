package be.intecBrussel.Object_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        String text = new String("This is some text");
        LocalDateTime date = LocalDateTime.now();

        try(FileOutputStream file = new FileOutputStream("MyFile.ser");
            ObjectOutputStream out = new ObjectOutputStream(file)){
            out.writeObject(text);
            out.writeObject(date);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("objects are serialized!");
        }

    }
}
