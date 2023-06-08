package org.example.hw1.comparators;

import org.example.hw1.FamilyItem;

import java.util.Comparator;

public class PersonComparatorByBirthYear<Person extends FamilyItem> implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {

        return Integer.compare(o1.getBirthYears(), o2.getBirthYears());
    }
}
