package org.example.hw1;

import org.example.hw1.comparators.PersonComparatorByBirthYear;
import org.example.hw1.comparators.PersonComparatorByName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonFamily implements Family {
    private final List<Person> personList;
    public PersonFamily() {

        personList = new ArrayList<>();
    }
    public void addPerson(Person person) {
        personList.add(person);
    }
    public List<Person> getPersonList() {
        return personList;
    }
    public void sortByBirthYear(){
        personList.sort(new PersonComparatorByBirthYear<>());
    }
    public void sortByName(){
        personList.sort(new PersonComparatorByName<>());
    }

    @Override
    public Iterator<Person> iterator() {

        return new PersonIterator(personList);
    }
}
