package dao.customer;

import dao.Dao;
import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryCustomerDao implements CustomerDao {
    private HashMap<String, Customer> customers = new HashMap<>();
    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public void delete(Customer customer) {
        customers.remove(customer.getId());
    }

    @Override
    public void update(Customer customer) {
        customers.replace(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public List<Customer> getAll() {
        return new ArrayList<>(customers.values());
    }
}
