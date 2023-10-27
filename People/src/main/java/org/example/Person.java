package org.example;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    static int instances = 0;
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Person() {
        setFirstName("");
        setLastName("");
        setDateOfBirth(LocalDate.now());
        instances++;
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        instances++;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    // Age by the specified date
    public int getAge(LocalDate date) {
        return Period.between(this.dateOfBirth, date).getYears();
    }

    static int getInstances() {
        return instances;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Date of birth: " + dateOfBirth.format(dateFormat) + " (" + getAge() + " years old)";
    }

    // Convert to string while specifying a date
    public String toString(LocalDate date) {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Date of birth: " + dateOfBirth.format(dateFormat) + " (" + getAge(date) + " years old)";
    }
}
