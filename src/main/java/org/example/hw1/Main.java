package org.example.hw1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person mother = new Person("Ольга", 1972, Gender.Female, Education.Secondary);
        Person father = new Person("Иван", 1969, Gender.Male, Education.Higher);
        Person child1 = new Person("Катя", 1996, Gender.Female, Education.None);
        Person child2 = new Person("Миша", 1998, Gender.Male, Education.Elementary);
        Person child3 = new Person("Даша", 2000, Gender.Female, Education.Elementary);

        GenealogyTree tree = new GenealogyTree();
        tree.setRoot(mother);
        tree.addPerson(father, "Ольга", "");
        tree.addPerson(child1, "Ольга", "Иван");
        tree.addPerson(child2, "Ольга", "Иван");
        tree.addPerson(child3, "Ольга", "Иван");

        List<Person> searchResult = tree.searchPerson("Катя");
        System.out.println("Search results for person with name 'Катя':");
        for (Person person : searchResult) {
            System.out.println(person.getName());
        }
    }
}
