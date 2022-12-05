package service.extend.impl;

import models.person.Employee;
import service.extend.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    List<Employee> list =new ArrayList<>();
    private static final List<Employee> listEmployee;

    static {
        listEmployee = new ArrayList<>();
    }


    @Override
    public void getList() {
        for (Employee employee : listEmployee) {
            System.out.println(employee);
        }
    }

    @Override
    public void add(Employee employee) {
        listEmployee.add(employee);
    }

    @Override
    public void edit(Employee employee) {

        for (Employee employee1:list ) {
            if (employee1.getIdStaff()==employee.getIdStaff()){
                employee1.setLevel(employee.getLevel());
                employee1.setPosition(employee.getPosition());
                employee1.setWage(employee.getWage());
                employee1.setEmail(employee.getEmail());
                employee1.setAddress(employee.getAddress());
            }


        }
    }

    @Override
    public void delete(int id) {
       for (int i=0;i<list.size();i++){
           if(id==list.get(i).getIdStaff()){
               list.remove(list.get(i));
               break;
           }
       }
    }
}


