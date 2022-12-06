package org.example;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        PersonFilter personFilter = new PersonFilter();
        List<Person> persons = List.of(
                new Person("Pamela", 26, Sex.FEMALE),
                new Person("Angela", 30, Sex.FEMALE),
                new Person("Phyllis", 56, Sex.FEMALE),
                new Person("Jazz", 13, Sex.FEMALE),
                new Person("Jim", 27, Sex.MALE),
                new Person("Dwight", 35, Sex.MALE),
                new Person("Michael", 40, Sex.MALE),
                new Person("Creed", 75, Sex.MALE),
                new Person("Ryan", 17, Sex.MALE),
                new Person("Alex", 22, Sex.NONBINARY)
        );

        System.out.println(personFilter.youngWomen(persons));
        System.out.println(personFilter.averageAgeOfMen(persons));
        System.out.println(personFilter.ableBodiedPersons(persons));
    }
}
