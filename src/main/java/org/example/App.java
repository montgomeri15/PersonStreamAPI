package org.example;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        PersonFilter personFilter = new PersonFilter();

        List<Person> persons = List.of(
                new Person("Pamela", 26, Sex.WOMAN),
                new Person("Angela", 30, Sex.WOMAN),
                new Person("Phyllis", 56, Sex.WOMAN),
                new Person("Jazz", 13, Sex.WOMAN),
                new Person("Jim", 27, Sex.MAN),
                new Person("Dwight", 35, Sex.MAN),
                new Person("Michael", 40, Sex.MAN),
                new Person("Creed", 75, Sex.MAN),
                new Person("Ryan", 17, Sex.MAN),
                new Person("Alex", 22, Sex.NONBINARY)
        );

        System.out.println(personFilter.youngWomen(persons));
        System.out.println(personFilter.averageAgeOfMen(persons));
        System.out.println(personFilter.ableBodiedPersons(persons));
    }
}
