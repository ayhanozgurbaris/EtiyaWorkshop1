package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCustomerDao implements CustomerDao {

    List<Customer> customers = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public void delete(Customer customer) {
        customers.remove(customer);
        System.out.println(customer.getFirstName() + customer.getLastName() + " adlı müşteri silindi.");
    }

    @Override
    public Customer getByCustomerId(int id) {
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}
