package service.extend.impl;

import models.person.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    List<Customer> list = new ArrayList<>();
    private static final List<Customer> listCustomer;

    static {
        listCustomer = new ArrayList<>();
    }

    @Override
    public void getList() {
        for (Customer customer : listCustomer) {
            System.out.println(customer);


        }
    }

    @Override
    public void add(Customer customer) {
        listCustomer.add(customer);
    }

    @Override
    public void edit(Customer customer) {
        for (Customer customer1 : listCustomer) {
            if (customer1.getIdClient() == customer.getIdClient()) {
                customer1.setAge(customer.getAge());
                customer1.setName(customer.getName());
                customer1.setAddress(customer.getAddress());

            }
        }


    }

    @Override
    public void delete(int id) {
for (int i=0; i< list.size();i++){
    if(id==list.get(i).getIdClient()){
        list.remove(list.get(i));
    }
}
    }
}
