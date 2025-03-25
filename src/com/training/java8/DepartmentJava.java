package com.training.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentJava {

    // Department class
    public static class Department {
        private int deptId;
        private String deptName;

        public Department(int deptId, String deptName) {
            this.deptId = deptId;
            this.deptName = deptName;
        }

        public int getDeptId() {
            return deptId;
        }

        public void setDeptId(int deptId) {
            this.deptId = deptId;
        }

        public String getDeptName() {
            return deptName;
        }

        public void setDeptName(String deptName) {
            this.deptName = deptName;
        }

        @Override
        public String toString() {
            return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
        }
    }

    public static void main(String[] args) {

        // Create Department instances
        Department dept1 = new Department(1, "Sales");
        Department dept2 = new Department(2, "IT");
        Department dept3 = new Department(3, "Accounting");
        Department dept4 = new Department(4, "Marketing");

        // Create Employee instances (Corrected Constructor)
        Employee emp1 = new Employee(101, "Eman", "MUSCAT", 'F', dept1, 5000, 30);
        Employee emp2 = new Employee(102, "Sara", "MUSCAT", 'F', dept2, 75000, 28);
        Employee emp3 = new Employee(103, "Anwaar", "IBRI", 'F', dept1, 60000, 33);
        Employee emp4 = new Employee(104, "Jeanan", "MUSCAT", 'F', dept2, 85000, 25);

        // List of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        // Print all employees
        System.out.println("All Employees:");
        employees.forEach(System.out::println);

        // Find employee with the highest salary
        Employee highestSalaryEmployee = employees.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .orElse(null);

        if (highestSalaryEmployee != null) {
            System.out.println("\nEmployee with the highest salary:");
            System.out.println(highestSalaryEmployee);
        } else {
            System.out.println("No employees found.");
        }

        // Group employees by city and print
        System.out.println("\nEmployees Grouped by City:");
        Map<String, List<Employee>> groupedByCity = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity));

        groupedByCity.forEach((city, empList) -> {
            System.out.println("City: " + city);
            empList.forEach(emp -> System.out.println(emp.getEmpName()));
        });

        // Find and display the number of employees in each department
        System.out.println("\nEmployee Count in Each Department:");
        Map<String, Long> deptEmployeeCount = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getEmpDept().getDeptName(), Collectors.counting()));

        deptEmployeeCount.forEach((deptName, count) -> System.out.println(deptName + ": " + count));

        // Print average age of Male and Female employees
        System.out.println("\nAverage Age of Male and Female Employees:");
        Map<Character, Double> avgAgeByGender = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        avgAgeByGender.forEach((gender, avgAge) -> System.out.println(gender + ": " + avgAge));
    }
}