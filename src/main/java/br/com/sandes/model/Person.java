package br.com.sandes.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private String secondName;
    private String email;
    private String address;
    private String gender;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(long id, String name, String secondName, String email, String address, String gender) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }

    public Person(String name, String secondName, String email, String address, String gender) {
        this.name = name;
        this.secondName = secondName;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }

    public Person(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(secondName, person.secondName) && Objects.equals(email, person.email) && Objects.equals(address, person.address) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(id);
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(secondName);
        result = 31 * result + Objects.hashCode(email);
        result = 31 * result + Objects.hashCode(address);
        result = 31 * result + Objects.hashCode(gender);
        return result;
    }
}
