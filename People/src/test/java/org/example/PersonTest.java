package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testGetFirstName() {
        Person person = new Person("John", "Smith", LocalDate.parse("2000-12-01"));
        assertEquals("John", person.getFirstName());
    }

    @Test
    void testSetFirstName() {
        Person person = new Person("John", "Smith", LocalDate.parse("2000-12-01"));
        person.setFirstName("Peter");
        assertEquals("Peter", person.getFirstName());
    }

    @Test
    void testGetLastName() {
        Person person = new Person("John", "Smith", LocalDate.parse("2000-12-01"));
        assertEquals("Smith", person.getLastName());
    }

    @Test
    void testSetLastName() {
        Person person = new Person("John", "Smith", LocalDate.parse("2000-12-01"));
        person.setLastName("Williams");
        assertEquals("Williams", person.getLastName());
    }

    @Test
    void testGetDateOfBirth() {
        Person person = new Person("John", "Smith", LocalDate.parse("2000-12-01"));
        assertEquals(LocalDate.parse("2000-12-01"), person.getDateOfBirth());
    }

    @Test
    void testSetDateOfBirth() {
        Person person = new Person("John", "Smith", LocalDate.parse("2000-12-01"));
        person.setDateOfBirth(LocalDate.parse("2012-02-01"));
        assertEquals(LocalDate.parse("2012-02-01"), person.getDateOfBirth());
    }

    @Test
    void testGetAge() {
        Person person = new Person("John", "Smith", LocalDate.now());
        assertEquals(0, person.getAge());
    }

    @Test
    void testGetInstances() {
        Person.instances = 0;
        Person person1 = new Person("John", "Smith", LocalDate.parse("2000-12-01"));
        Person person2 = new Person();
        Person person3 = new Person("Kim", "Williams", LocalDate.parse("1950-12-01"));
        assertEquals(3, Person.getInstances());
    }

    @Test
    void testToString() {
        Person person = new Person("John", "Smith", LocalDate.parse("2000-12-01"));
        assertEquals("Name: John Smith\nDate of birth: 01-12-2000 (22 years old)", person.toString(LocalDate.parse("2023-10-27")));
    }
}
