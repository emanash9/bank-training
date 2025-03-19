
package com.training.exercise4;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> customerList;

    // Constructor
    public CustomerManager() {
        customerList = new ArrayList<>();
    }

    // Add a customer
    public void addCustomer(Customer customer) {
        customerList.add(customer);
        System.out.println("Customer added: " + customer);
    }

    // Update customer information
    public void updateCustomer(int id, String newName, String newEmail) {
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                customer.setName(newName);
                customer.setEmail(newEmail);
                System.out.println("Customer updated: " + customer);
                return;
            }
        }
        System.out.println("Customer with id " + id + " not found.");
    }

    // Delete a customer by ID
    public void deleteCustomer(int id) {
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                customerList.remove(customer);
                System.out.println("Customer deleted: " + customer);
                return;
            }
        }
        System.out.println("Customer with id " + id + " not found.");
    }

    // Show all customer details
    public void showAllCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        }
    }
}


