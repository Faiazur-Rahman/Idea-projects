package org.example.JavaStreams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        //filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
//        females.forEach(female -> System.out.println(female));


        //sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
//        sorted.forEach(person -> System.out.println(person));

        //All Match

        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 6);

//        System.out.println(allMatch);

        //Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getName() == "Fa");
//        System.out.println(anyMatch);

        double a = 10;
        int b = (int) a;
        System.out.println(b);
        //None match
        boolean noneMatch = people.stream().noneMatch(person -> person.getName() == "Faiaz");
//        System.out.println(noneMatch);

        //Max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        //Min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        //Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach(((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
        }));
    }

    private static List<Person> getPeople(){
        return List.of(
                new Person("Faiaz",24, Gender.MALE),
                new Person("Jerin", 7,Gender.FEMALE),
                new Person("Fariha",50,Gender.FEMALE)
//                new Person("Lelin", 33,Gender.MALE)
        );
    }
}

