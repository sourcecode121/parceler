package com.example.parceler.model;

import org.parceler.Parcel;

/**
 * Created by Anand on 11/10/2016.
 */
@Parcel(Parcel.Serialization.BEAN)
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public User() {
    }

    public User(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
