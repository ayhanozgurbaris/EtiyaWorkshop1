package services.abstracts;

import entities.Customer;
import java.util.List;

public interface CustomerService {

    void add(Customer customer);

    List<Customer> getAll();

    void delete(Customer customer);

    Customer getByCustomerId(int id);


}