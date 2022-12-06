package org.example;

import lombok.NonNull;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFilter {

    public List<Person> youngWomen(@NonNull List<Person> persons){
        return persons.stream()
                .filter(person -> person.getSex() == Sex.FEMALE && person.getAge() >= 18 && person.getAge() <= 60)
                .sorted(Comparator.comparingInt(Person::getAge))
                .distinct()
                .collect(Collectors.toList());
    }

    public double averageAgeOfMen(@NonNull List<Person> persons){
        return persons.stream()
                .filter(person -> person.getSex() == Sex.MALE)
                .mapToDouble(Person::getAge)
                .average()
                .orElse(Double.NaN);
    }

    public List<Person> ableBodiedPersons(@NonNull List<Person> persons){
        return persons.stream()
                .filter(person -> person.getAge() >= 18 && (
                        (person.getSex() == Sex.FEMALE && person.getAge() < 55) ||
                        (person.getSex() == Sex.MALE && person.getAge() < 60))
                )
                .sorted(Comparator.comparingInt(Person::getAge))
                .distinct()
                .collect(Collectors.toList());
    }
}
