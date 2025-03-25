package com.training.java8;

public class Employee {
    private int empId;
    private String empName;
    private String city;
    private char gender;
    private DepartmentJava.Department empDept;
    private double salary;
    private int age;  // Added missing field

    // Constructor including Age
    public Employee(int empId, String empName, String city, char gender, DepartmentJava.Department empDept, double salary, int age) {
        this.empId = empId;
        this.empName = empName;
        this.city = city;
        this.gender = gender;
        this.empDept = empDept;
        this.salary = salary;
        this.age = age;
    }

    // Getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public DepartmentJava.Department getEmpDept() {
        return empDept;
    }

    public void setEmpDept(DepartmentJava.Department empDept) {
        this.empDept = empDept;
    }

    public int getAge() {  // Added getter for Age
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", city=" + city + ", gender=" + gender + ", empDept="
                + empDept + ", salary=" + salary + ", age=" + age + "]";
    }
}