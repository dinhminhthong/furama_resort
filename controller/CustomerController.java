package controller;

import models.person.Customer;
import service.extend.impl.CustomerServiceImpl;

public class CustomerController {
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    public void getList() {
        customerService.getList();
    }
    public void add(Customer customer) {
        customerService.add(customer);
    }
    public void edit(Customer customer){
        customerService.edit(customer);
    }
    public void delete(int id) {
        customerService.delete(id);
    }
}
