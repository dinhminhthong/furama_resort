package service.extend.impl;

import models.person.Customer;
import service.extend.ICustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {

    private static final List<Customer> listCustomer;

    static {
        listCustomer = new ArrayList<>();
    }

    @Override
    public List<Customer> getList() {
        for (Customer customer : listCustomer) {
            System.out.println(customer);

        }
        return listCustomer;
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
    public void delete(Customer customer) {
        Customer deleteCustomer = null;
        for (Customer customer1: listCustomer) {
            if (customer1.getIdClient()==customer.getIdClient());
            deleteCustomer= customer1;
            break;


        }

    }


}
