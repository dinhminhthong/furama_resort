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
                customer1.setName(customer.getName());
                customer1.setGender(customer.getGender());
                customer1.setCMND(customer.getCMND());
                customer1.setAge(customer.getAge());
                customer1.setTelephonenumber(customer.getTelephonenumber());
                customer1.setEmail(customer.getEmail());
                customer1.setAddress(customer.getAddress());
                customer1.setIdClient(customer.getIdClient());
                customer1.setTypeClient(customer.getTypeClient());
//                (String name, String gender, int CMND,
//                String age, String telephonenumber, String email, String address, int idClient, String typeClient
            }
        }


    }

    @Override
    public void delete(Customer customer) {
        Customer deleteCustomer = null;
        for (Customer customer1: listCustomer) {
            if (customer1.getIdClient()==customer.getIdClient()) {


                deleteCustomer = customer1;
                break;
            }

        }
          listCustomer.remove(deleteCustomer);
    }


}
