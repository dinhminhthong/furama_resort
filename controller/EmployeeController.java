package controller;

import models.person.Employee;
import service.extend.IEmployeeService;
import service.extend.impl.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    IEmployeeService employeeService =new EmployeeServiceImpl();
    public void delete(Employee employee) {
        employeeService.delete(employee);
    }
    public void edit(Employee employee) {
        employeeService.edit(employee);
    }
    public void add(Employee employee) {
        employeeService.add(employee);
    }
    public List<Employee> getList() {
        return employeeService.getList();

    }
}
