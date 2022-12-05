package controller;

import models.person.Employee;
import service.extend.impl.EmployeeServiceImpl;

public class EmployeeController {
    EmployeeServiceImpl employeeService =new EmployeeServiceImpl();
    public void delete(int id) {
        employeeService.delete(id);
    }
    public void edit(Employee employee) {
        employeeService.edit(employee);
    }
    public void add(Employee employee) {
        employeeService.add(employee);
    }
    public void getList() {
        employeeService.getList();
    }
}
