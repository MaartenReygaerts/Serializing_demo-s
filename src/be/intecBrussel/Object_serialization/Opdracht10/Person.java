package be.intecBrussel.Object_serialization.Opdracht10;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private String firstname;
    private String lastname;
    private LocalDate birthDay;
    private String birthPlace;

    //public static final long serialVersionUID = -1549680695000277476;

    public Person(String fName, String lName, LocalDate birthDay,String birthPlace){
        this.firstname = fName;
        this.lastname = lName;
        this.birthDay = birthDay;
        this.birthDay = birthDay;

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

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }


}
