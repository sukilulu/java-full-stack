package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ids = List.of(1, 2, 3);
        Employee emp = new Employee("Doe", "John", "john.doe@example.com", 1234, false, ids);

        System.out.println("Employee Name: " + emp.getFirstName() + " " + emp.getLastName());
        System.out.println("Email: " + emp.getEmail());
        System.out.println("Flagged: " + emp.getFlagged());
        System.out.println("List: " + emp.getList());
    }
}

final class Employee {
    private final String lastName;
    private final String firstName;
    private final String email;
    private final Integer password;
    private final Boolean flagged;
    private final List<Integer> list;

    public Employee(String lastName, String firstName, String email,
                    Integer password, Boolean flagged, List<Integer> list) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.flagged = flagged;
        this.list = list == null ? null : Collections.unmodifiableList(new ArrayList<>(list));
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPassword() {
        return password;
    }

    public Boolean getFlagged() {
        return flagged;
    }

    public List<Integer> getList() {
        return list;
    }
}
