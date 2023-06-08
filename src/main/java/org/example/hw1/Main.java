package org.example.hw1;

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

        PersonFamily list = new PersonFamily();
        list.addPerson(mother);
        list.addPerson(father);
        list.addPerson(child1);
        list.addPerson(child2);
        list.addPerson(child3);

        for (Person person : list) {
            System.out.println(person.toString());
        }

        System.out.println("_________ Сортировка по имени ___________");

        list.sortByName();

        for (Person person : list) {
            System.out.println(person.toString());
        }

        System.out.println("_________ Сортировка по году рождения ___________");

        list.sortByBirthYear();

        for (Person person : list) {
                System.out.println(person.toString());
        }
    }
}








