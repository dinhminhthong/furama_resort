package controller;

import models.person.Customer;
import service.extend.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    public List<Customer> getList() {
       return customerService.getList();

    }
    public void add(Customer customer) {
        customerService.add(customer);
    }
    public void edit(Customer customer){
        customerService.edit(customer);
    }
    public void delete(Customer customer) {
        customerService.delete(customer);
    }
}
