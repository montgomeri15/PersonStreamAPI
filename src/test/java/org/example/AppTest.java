package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTest {

    @Test
    @DisplayName("The list of women from 18 to 60 years old is correct")
    void testCorrectYoungWomen() {
        PersonFilter personFilter = new PersonFilter();
        List<Person> testPersons = List.of(
                new Person("Pamela", 26, Sex.FEMALE),
                new Person("Angela", 30, Sex.FEMALE),
                new Person("Phyllis", 56, Sex.FEMALE),
                new Person("Jazz", 13, Sex.FEMALE)
        );

        assertThat(personFilter.youngWomen(testPersons)).isNotNull()
                .hasToString("[Person(name=Pamela, age=26, sex=WOMAN), " +
                        "Person(name=Angela, age=30, sex=WOMAN), " +
                        "Person(name=Phyllis, age=56, sex=WOMAN)]");
    }

    @Test
    @DisplayName("The average age of men is correct")
    void testCorrectAverageAgeOfMen() {
        PersonFilter personFilter = new PersonFilter();
        List<Person> testPersons = List.of(
                new Person("Pamela", 26, Sex.FEMALE),
                new Person("Jim", 27, Sex.MALE),
                new Person("Dwight", 35, Sex.MALE),
                new Person("Michael", 40, Sex.MALE),
                new Person("Creed", 75, Sex.MALE),
                new Person("Ryan", 17, Sex.MALE)
        );

        assertThat(personFilter.averageAgeOfMen(testPersons)).isNotNull()
                .isEqualTo(38.8);
    }

    @Test
    @DisplayName("The list of able bodied persons is correct")
    void testCorrectAbleBodiedPersons() {
        PersonFilter personFilter = new PersonFilter();
        List<Person> testPersons = List.of(
                new Person("Pamela", 26, Sex.FEMALE),
                new Person("Phyllis", 56, Sex.FEMALE),
                new Person("Jazz", 13, Sex.FEMALE),
                new Person("Jim", 27, Sex.MALE),
                new Person("Michael", 40, Sex.MALE),
                new Person("Creed", 75, Sex.MALE),
                new Person("Ryan", 17, Sex.MALE)
        );

        assertThat(personFilter.ableBodiedPersons(testPersons)).isNotNull()
                .hasToString("[Person(name=Pamela, age=26, sex=FEMALE), " +
                        "Person(name=Jim, age=27, sex=MALE), " +
                        "Person(name=Michael, age=40, sex=MALE)]");
    }
}
