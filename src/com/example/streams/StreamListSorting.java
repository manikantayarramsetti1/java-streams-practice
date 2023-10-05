package com.example.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("grapes");
        fruits.add("banana");
        fruits.add("guava");
        fruits.add("pine apple");
        fruits.add("orange");

        // sorting ascending order

        List<String> sortedFruits = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedFruits);

        List<String> sort = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);

        List<String> listSort = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(listSort);

        // sorting descending order
        List<String> sortDec = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortDec);

        List<String> listSort2 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(listSort2);

        // sort employee by salary in ascending order
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "mani", 25, 50000));
        employees.add(new Employee(2, "sai", 26, 68000));
        employees.add(new Employee(3, "deepak", 23, 78000));
        employees.add(new Employee(4, "manikanta", 27, 28000));
        employees.add(new Employee(5, "satya", 65, 38000));
        List sortEmployee = employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println(sortEmployee);

        List sortEmployeeSalary =  employees.stream().
                sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(sortEmployeeSalary);

        List sortEmployeeSalary2 =  employees.stream().
                sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(sortEmployeeSalary2);

        // sort employee by age in ascending order
        List sortEmployeeAGe =  employees.stream().
                sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        System.out.println(sortEmployeeAGe);

        List<Employee> emp = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(emp);
    }
}
