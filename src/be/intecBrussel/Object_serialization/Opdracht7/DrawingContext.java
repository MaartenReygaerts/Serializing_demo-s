package be.intecBrussel.Object_serialization.Opdracht7;

import java.io.*;

public class DrawingContext {
    public static void main(String[] args) {

        Drawing drawing = new Drawing ();
        drawing.add(new Rectangle(5,6));
        drawing.add(new Square (5));
        Triangle t1 = new Triangle(4,8,6);
        drawing.add(t1);
        drawing.add(new IsoScelesTriangle (7,8));

        try {
            drawing.add(new Circle (-7));
        } catch(NegativeSizeException nse) {
            nse.getMessage();
        }
        try (FileOutputStream file = new FileOutputStream("Drawing.ser");
             ObjectOutputStream out = new ObjectOutputStream(file)){

            out.writeObject(drawing);
        } catch( IOException nse) {
            nse.getMessage();
        }

    }
}

