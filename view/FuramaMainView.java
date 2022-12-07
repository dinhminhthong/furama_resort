package view;

import controller.EmployeeController;
import models.person.Employee;
import service.extend.impl.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuramaMainView {
    private final EmployeeController employeeController = new EmployeeController();
    public void displayMainViewFurama() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    do {
                        System.out.println("1. Display list employee");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Delete employee");
                        System.out.println("4. Edit employee");
                        System.out.println("5. Return main menu");
                        int optionEmployee = Integer.parseInt(sc.nextLine());
                        switch (optionEmployee) {
                            case 1:
                                List<Employee> listEmployee = new ArrayList<>();
                                for (Employee employee: listEmployee ) {
                                    System.out.println(employee);


                                }
                            case 2:
                                System.out.println("1. enter name of employee");
                                String nameEmployee = sc.nextLine();
                                System.out.println("2. enter gender of employee");
                                String gender = sc.nextLine();
                                System.out.println("3. enter cmnd of employee");
                                int cmndEmployee = Integer.parseInt(sc.nextLine());
                                System.out.println("4. enter age of employee");
                                String ageEmployee = sc.nextLine();
                                System.out.println("5. enter telephone number of employee");
                                String telephonenumberEmployee = sc.nextLine();
                                System.out.println("6. enter email of employee");
                                String emailEmployee = sc.nextLine();
                                System.out.println("7. enter address of employee");
                                String addressEmployee = sc.nextLine();
                                System.out.println("8. enter id of employee");
                                int idEmployee = Integer.parseInt(sc.nextLine());
                                System.out.println("9. enter level of employee");
                                String levelEmployee = sc.nextLine();
                                System.out.println("10. enter position of employee");
                                String positionEmployee = sc.nextLine();
                                System.out.println("11. enter wage of employee");
                                int wage = Integer.parseInt(sc.nextLine());
                                Employee employee = new Employee(nameEmployee,gender,cmndEmployee,ageEmployee,
                                        telephonenumberEmployee,emailEmployee,addressEmployee,idEmployee,levelEmployee
                                        ,positionEmployee,wage );
                                employeeController.add(employee);
                                break;

                            case 3:
                                Employee employee1=new Employee();
                                this.employeeController.delete(employee1);
                                break;
                            case 4:
                                System.out.println("enter edit cmnd of emplyee");
                                int cmnd =Integer.parseInt(sc.nextLine());
                                System.out.println("enter edit ege of employee");
                                String age = sc.nextLine();
                                Employee employee2 =new Employee();
                                employeeController.edit(employee2);
                                break;
                            case 5:
                               this.displayMainViewFurama();
                            default:
                                System.out.println("chon sai roi nhap lai di");
                        }
                        break;
                    } while (true);
                case 2:
                    do {
                        System.out.println("1. Display customer");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4.Return main menu");
                        int optionCustomer = Integer.parseInt(sc.nextLine());
                        switch (optionCustomer){
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                displayMainViewFurama();
                            default:
                                System.out.println("nhap sai roi nhap lai di");
                        }


                    } while (true);
                case 3:
                    do {
                        System.out.println("1. Display list Facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        int optionFacility = Integer.parseInt(sc.nextLine());
                        switch (optionFacility){
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                displayMainViewFurama();
                            default:
                                System.out.println("nhap sai roi nhap lai di");
                        }

                    } while (true);
                case 4:
                    do {
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Return main menu");
                        int optionBoking = Integer.parseInt(sc.nextLine());
                        switch (optionBoking){
                            case 1:
                            case 2:
                            case 3:
                                displayMainViewFurama();
                            default:
                                System.out.println("nhap sai roi nhap lai di");
                        }
                    } while (true);
                case 5:
                    do{
                        System.out.println("1. Display list customer use service");
                        System.out.println("2. Display list customer get voucher");
                        System.out.println("3. Return main menu");
                        int optionPromotion = Integer.parseInt(sc.nextLine());
                        switch (optionPromotion){
                            case 1:
                            case 2:
                            case 3:
                                displayMainViewFurama();
                            default:
                                System.out.println("nhap sai roi nhap lai di");
                        }

                    }while (true);

                case 6:
                    System.exit(1);
                default:
                    System.out.println("nhap lai di");
            }

        } while (true);

    }
}
