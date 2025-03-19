
import java.util.ArrayList;
import java.util.List;

class Customer {
    private int customerId;
    private String customerName;
    private String email;

    public Customer(int customerId, String customerName, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + customerName + ", Email: " + email;
    }
}

class CustomerManager {
    private List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void updateCustomer(int customerId, String newName, String newEmail) {
        for (Customer customer : customerList) {
            if (customer.getCustomerId() == customerId) {
                customer.setCustomerName(newName);
                customer.setEmail(newEmail);
                return;
            }
        }
    }

    public void deleteCustomer(int customerId) {
        customerList.removeIf(customer -> customer.getCustomerId() == customerId);
    }

    public void showAllCustomers() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
}



