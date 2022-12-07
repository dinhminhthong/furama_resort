package service.extend.impl;

import models.person.Customer;
import models.person.Employee;
import service.extend.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private static final List<Employee> listEmployee;

    static {
        listEmployee = new ArrayList<>();
    }


    @Override
    public List<Employee> getList() {

        return listEmployee;
    }

    @Override
    public void add(Employee employee) {
        listEmployee.add(employee);
    }

    @Override
    public void edit(Employee employee) {

        for (Employee employee1 : listEmployee) {
            if (employee1.getIdStaff() == employee.getIdStaff()) {
                employee1.setLevel(employee.getLevel());
                employee1.setPosition(employee.getPosition());
                employee1.setWage(employee.getWage());
                employee1.setEmail(employee.getEmail());
                employee1.setAddress(employee.getAddress());
                employee1.setCMND(employee.getCMND());

            }


        }
    }

    @Override
    public void delete(Employee employee) {
        Employee deleteEmployee = null;
        for (Employee e : listEmployee) {
            if (e.getIdStaff() == employee.getIdStaff()) {
                deleteEmployee = e;
                break;
            }
        }
        listEmployee.remove(deleteEmployee);
    }
}



