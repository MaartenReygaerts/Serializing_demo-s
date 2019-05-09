package be.intecBrussel.Object_serialization.Opdracht8_1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Car implements Serializable {
    private static final int NUMBER_WHEELS = 4;

    protected String brand;
    protected double weight;
    protected double height;

    protected transient Bug bug = new Bug();

    public Car(String brand, double weight, double height){
        this.brand = brand;
        this.weight = weight;
        this.height=height;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static int getNumberWheels() {
        return NUMBER_WHEELS;
    }

    public void newFeatures(){
        System.out.println(bug.getCause());
    }
    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
    }
    private void readObject(ObjectInputStream s) throws IOException,ClassNotFoundException {
        s.defaultReadObject();
        bug = new Bug();
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
