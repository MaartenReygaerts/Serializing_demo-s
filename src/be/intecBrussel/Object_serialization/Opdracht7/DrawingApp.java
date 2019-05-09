package be.intecBrussel.Object_serialization.Opdracht7;

public class DrawingApp {
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

      for(Object s: drawing.getDrawables()) {
         System.out.println(s);
      }
      System.out.println ("*************************");

      drawing.remove(t1);
      for(Object s: drawing.getDrawables()) {
         System.out.println(s);
      }
      System.out.println ("*************************");
      drawing.add(new Rectangle(10,15,7,5));
      for(Object s: drawing.getDrawables()) {
         System.out.println(s);
      }
   }   
}
