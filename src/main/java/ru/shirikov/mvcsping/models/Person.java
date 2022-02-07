package ru.shirikov.mvcsping.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private int id;


    @NotEmpty(message = "Enter name")
    @Size(min = 2, max = 30, message = "Name size is incorrect")
    // @Min - для чисел @Email
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }
}
