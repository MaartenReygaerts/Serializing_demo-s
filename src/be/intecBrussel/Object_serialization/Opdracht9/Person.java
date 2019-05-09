package be.intecBrussel.Object_serialization.Opdracht9;

import java.io.*;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

public class Person implements Externalizable {
    private String firstname;
    private String lastname;
    private LocalDate birthDay;

    private transient Timer heartbeat;

    public Person(String fName, String lName, LocalDate birthDay){
        this.firstname = fName;
        this.lastname = lName;
        this.birthDay = birthDay;

        heartbeat = new Timer(true);
        heartbeat.scheduleAtFixedRate(new Heartbeat(), 0, 1000);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(firstname);
        out.writeObject(lastname);
        out.writeObject(birthDay);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstname = (String) in.readObject();
        lastname = (String) in.readObject();
        birthDay = (LocalDate) in.readObject();

        heartbeat = new Timer(true);
        heartbeat.scheduleAtFixedRate(new Heartbeat(),0,1000);
    }

    private class Heartbeat extends TimerTask {
        public void run(){
            System.out.println("*");
        }
    }
}
