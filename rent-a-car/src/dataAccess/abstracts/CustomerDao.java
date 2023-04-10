package dataAccess.abstracts;

import entities.Customer;

import java.util.List;

public interface CustomerDao {
    void add(Customer customer);

    List<Customer> getAll();

    void delete(Customer customer);

    Customer getByCustomerId(int id);
}
