package org.example.hw1;
// Класс Person (Человек).

        import java.io.Serializable;
        import java.util.ArrayList;
        import java.util.List;

public class Person implements Serializable, Comparable<Person>, FamilyItem {
    private String name;
    private int birthYear;
    private Gender gender;
    private List<Person> children;

    public Person(String name, int birthYear, Gender gender, Education education) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.children = new ArrayList<>();
    }

    public Person(String name, int birthYear, Gender gender, List<Person> children) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.children = children;
    }

    public Person(String name, int birthYears) {
    }

    public Person(List<Person> listFamily) {
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

        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public Person[] getChildren() {

        return this.children.toArray(new Person[0]);
    }

    @Override
    public String toString() {
        return "person.Person{" +
                "birthYear=" + birthYear +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {

        return name.compareTo(o.getName());
    }

    public int getBirthYears() {

        return birthYear;
    }
}

