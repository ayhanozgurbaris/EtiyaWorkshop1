package services.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.Customer;
import services.abstracts.CustomerService;

import java.util.List;

public class CustomerManager implements CustomerService {
    private final CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void add(Customer customer) {
        for (Customer customers : customerDao.getAll()) {
            if (customers.getId() == customer.getId()) {
                System.out.println(customer.getId() + " ID numaralı müşteri zaten mevcut. " + customer.getFirstName() + " " + customer.getLastName() + " adlı müşteri eklenemedi.");
                return;
            }
        }
        customerDao.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }


    @Override
    public void delete(Customer customer) {
        customerDao.delete(customer);
    }

    @Override
    public Customer getByCustomerId(int id) {
        return customerDao.getByCustomerId(id);
    }


}