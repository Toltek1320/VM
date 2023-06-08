package org.example.hw1;

import java.util.List;

public interface Family extends Iterable<Person> {
    void addPerson(Person person);

    List<Person> getPersonList();
    void sortByBirthYear();
    void  sortByName();
}
