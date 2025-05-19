package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

final class Employee {
    private final String lastName;
    private final String firstName;
    private final String email;
    private final Integer password;
    private final Boolean flagged;
    private final List<Integer> list;
    private int id;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(lastName, employee.lastName) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(email, employee.email) &&
                Objects.equals(password, employee.password) &&
                Objects.equals(flagged, employee.flagged) &&
                Objects.equals(list, employee.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, email, password, flagged, list);
    }




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

        //123456
    }


}