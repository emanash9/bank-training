package com.training.exercise4;


public class Main {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();

        // Add customers
        manager.addCustomer(new Customer(1, "sara", "sara1@example.com"));
        manager.addCustomer(new Customer(2, "Jeanan", "jeanan@example.com"));
        manager.addCustomer(new Customer(3, "Anwaar", "anwaar@example.com"));


        // Show all customers
        System.out.println("\nAll customers:");
        manager.showAllCustomers();

        // Update a customer
        manager.updateCustomer(1, "eman", "eman@example.com");

        // Delete a customer
        manager.deleteCustomer(3);

        // Show all customers after update and delete
        System.out.println("\nAll customers after update and delete:");
        manager.showAllCustomers();
    }
}
