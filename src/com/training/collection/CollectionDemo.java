//package com.training.collection;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.Map.Entry;
//import java.util.Objects;
//
//
//
//public class CollectionDemo {
//
//    public static void main(String[] args) {
//
//        System.out.println("-- This is our List --");
//
//        // List Example
//        List<String> names = new ArrayList<>();
//        names.add("Ahmed");
//        names.add("Hassan");
//        names.add("Ali");
//        names.add("Fatimah");
//        names.add("Ali"); // Duplicates are allowed in a List
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        System.out.println("\n-- This is our Set --");
//
//        // Set Example
//        Set<String> namesSet = new HashSet<>();
//        namesSet.add("Ahmed");
//        namesSet.add("Hassan");
//        namesSet.add("Ali");
//        namesSet.add("Fatimah");
//        namesSet.add("Ali"); // Duplicates are removed in a Set
//
//        for (String name : namesSet) {
//            System.out.println(name);
//        }
//
//        // Employee Set Example (Ensure Employee class exists)
//        Set<Employee> employeeSet = new HashSet<>();
//        employeeSet.add(new Employee(1, "Sara", "IT", 500000));
//        employeeSet.add(new Employee(2, "Jeanan", "HR", 55000));
//        employeeSet.add(new Employee(3, "Eman", "Finance", 60000));
//        employeeSet.add(new Employee(3, "Eman", "Finance", 60000)); // Duplicate
//
//        System.out.println("\n-- Employee Set --");
//        for (Employee emp : employeeSet) {
//            System.out.println(emp);
//        }
//
//        // ✅ Correctly Placed Map
//        System.out.println("\n-- Employee Map --");
//
//        Map<Integer, String> empMap = new HashMap<>();
//        empMap.put(101, "Mohammed");
//        empMap.put(102, "Suleiman");
//        empMap.put(103, "Farah");
//        empMap.put(101, "Noorie"); // Overwrites Mohammed
//
//        for (Map.Entry<Integer, String> empEntry : empMap.entrySet()) {
//            System.out.println(empEntry.getKey() + ": " + empEntry.getValue());
//        }
//    }
//}
//
//// ✅ Employee Class Definition
//class Employee {
//    private int id;
//    private String name;
//    private String department;
//    private double salary;
//
//    public Employee(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return id + " - " + name + " (" + department + "), Salary: " + salary;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Employee employee = (Employee) obj;
//        return id == employee.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//}
