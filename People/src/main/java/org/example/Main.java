package org.example;
import org.example.Person;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Smith", LocalDate.parse("2000-12-01"));
        Person person2 = new Person();
        Person person3 = new Person("Kim", "Williams", LocalDate.parse("1950-12-01"));

        person2.setFirstName("Mary");
        person2.setLastName("Phillips");
        person2.setDateOfBirth(LocalDate.parse("1980-02-05"));

        System.out.println(person1.toString());
        System.out.println();
        System.out.println(person2.toString());
        System.out.println();
        System.out.println(person3.toString());
        System.out.println();

        System.out.println("Total number of people: " + Person.getInstances());
    }
}