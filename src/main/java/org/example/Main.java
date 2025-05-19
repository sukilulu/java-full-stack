package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> ids = List.of(1, 2, 3);
        Employee emp = new Employee("Doe", "John", "john.doe@example.com", 1234, false, ids);
        Employee emp2 = new Employee("Doe", "John", "john.doe@example.com", 1234, false, ids);
        Set<Employee> set = new HashSet<Employee>();
        set.add(emp2);
        set.add(emp);

        System.out.println(Objects.equals(emp,emp2));
        System.out.println(emp==emp2);

        Integer i1 = new Integer(1);
        Integer i2 = new Integer (1);
        System.out.println(i1 == i2);//false   new objects

        Integer i3= Integer.valueOf(1);
        Integer i4= Integer.valueOf(1);
        System.out.println(i3==i4);//true   cached

        Integer i5=100;
        Integer i6=100;
        System.out.println(i5 == i6); //cached object

        Integer i7=128;
        Integer i8=128;
        System.out.println(i7 ==i8);



        List<Employee> employees = Arrays.asList(
                new Employee("Smith", "Alice", "alice@example.com", 1234, false, Arrays.asList(1, 2, 3)),
                new Employee("Brown", "Bob", "bob@example.com", 2345, true, Arrays.asList(4, 5, 6)),
                new Employee("Clark", "Charlie", "charlie@example.com", 3456, false, Arrays.asList(7, 8)),
                new Employee("Davis", "Dana", "dana@example.com", 4567, true, Arrays.asList(9))
        );

        //Filter flagged employees
        List<Employee> flagged = employees.stream()
                .filter(Employee::getFlagged)
                .collect(Collectors.toList());

        System.out.println("Flagged Employees:");
        flagged.forEach(System.out::println);


        //Extract email addresses
        List<String> emails = employees.stream()
                .map(Employee::getEmail)
                .collect(Collectors.toList());

        System.out.println("Emails: " + emails);


        //Flatten all integers from all employee list fields
        List<Integer> allInts = employees.stream()
                .flatMap(e -> e.getList().stream())
                .collect(Collectors.toList());

        System.out.println("Flattened List Values: " + allInts);


        System.out.println(set.size());
//        System.out.println("Employee Name: " + emp.getFirstName() + " " + emp.getLastName());
//        System.out.println("Email: " + emp.getEmail());
//        System.out.println("Flagged: " + emp.getFlagged());
//        System.out.println("List: " + emp.getList());


    }
}




