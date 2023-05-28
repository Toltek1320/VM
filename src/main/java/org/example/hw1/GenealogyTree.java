package org.example.hw1;
// Класс GenealogyTree (генеалогическое дерево).

import java.util.ArrayList;
import java.util.List;

public class GenealogyTree {
    private Person root;

    public void setRoot(Person person) {

        this.root = person;
    }

    public void addPerson(Person person, String motherName, String fatherName) {
        addPersonToTree(root, person, motherName, fatherName);
    }

    private boolean addPersonToTree(Person current, Person person, String motherName, String fatherName) {
        if (current == null) {
            return false;
        }

        if (current.getName().equals(motherName)) {
            current.addChild(person);
            person.setMother(current);
            return true;
        }

        if (current.getName().equals(fatherName)) {
            current.addChild(person);
            person.setFather(current);
            return true;
        }

        for (Person child : current.getChildren()) {
            if (addPersonToTree(child, person, motherName, fatherName)) {
                return true;
            }
        }

        return false;
    }

    public List<Person> searchPerson(String name) {
        List<Person> result = new ArrayList<>();
        searchPersonInTree(root, name, result);
        return result;
    }

    private void searchPersonInTree(Person current, String name, List<Person> result) {
        if (current == null) {
            return;
        }

        if (current.getName().equals(name)) {
            result.add(current);
        }

        for (Person child : current.getChildren()) {
            searchPersonInTree(child, name, result);
        }
    }
}

