package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFilter {

    public List<Person> youngWomen(List<Person> persons){
        return persons.stream()
                .filter(person -> person.getSex() == Sex.WOMAN && person.getAge() >= 18 && person.getAge() <= 60)
                .sorted(Comparator.comparingInt(Person::getAge))
                .distinct()
                .collect(Collectors.toList());
    }

    public double averageAgeOfMen(List<Person> persons){
        return persons.stream()
                .filter(person -> person.getSex() == Sex.MAN)
                .mapToDouble(Person::getAge)
                .average()
                .orElse(Double.NaN);
    }

    public List<Person> ableBodiedPersons (List<Person> persons){
        return persons.stream()
                .filter(person -> person.getAge() >= 18 && (
                        (person.getSex() == Sex.WOMAN && person.getAge() < 55) ||
                        (person.getSex() == Sex.MAN && person.getAge() < 60))
                )
                .sorted(Comparator.comparingInt(Person::getAge))
                .distinct()
                .collect(Collectors.toList());
    }
}
