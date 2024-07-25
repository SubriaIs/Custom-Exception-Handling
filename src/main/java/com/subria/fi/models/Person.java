package com.subria.fi.models;

import java.util.List;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private List<Salary> salaries;


    public List<Salary> getAllSalaries() {
        return salaries;
    }
    public Salary getSalaryByIndex(int index) {
        return salaries.get(index);
    }

    public void setSalaryToList(Salary salary) {
        this.salaries.add(salary);
    }

    public Person(int id, String firstName, String lastName, String position, List<Salary> salaries) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salaries = salaries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", salaries='" + salaries + '\'' +
                '}';
    }
}
