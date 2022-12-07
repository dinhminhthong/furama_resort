package service;


import models.person.Customer;

import java.util.List;

public interface IService<O> {

    List<O> getList();

    void add(O object);

    void edit(O object);

    void delete(O object);

}
