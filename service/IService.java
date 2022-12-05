package service;

import java.util.List;

public interface IService<Object> {

    void getList();

    void add(Object object);

    void edit(Object object);

    void delete(int id);

}
