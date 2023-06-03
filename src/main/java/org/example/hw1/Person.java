package org.example.hw1;
// Класс Person (Человек).

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable {
    private final String name;
    private final int birthYear;
    private final Gender gender;
    private final List<Person> children;

    public Person(String name, int birthYear, Gender gender, Education education) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.children = new ArrayList<>();
    }

    public void setMother(Person mother) {
    }

    public void setFather(Person father) {
    }

    public void addChild(Person child) {
        this.children.add(child);
        if (this.gender == Gender.Male) {
            child.setFather(this);
        } else {
            child.setMother(this);
        }
    }

    public String getName() {

        return this.name;
    }

    public Person[] getChildren() {

        return this.children.toArray(new Person[0]);
    }
}

