package view;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import controller.CustomerController;
import controller.EmployeeController;
import models.person.Customer;
import models.person.Employee;
import service.extend.impl.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuramaMainView {
    private final EmployeeController employeeController = new EmployeeController();
    private final CustomerController customerController = new CustomerController();
    public void displayMainViewFurama() {
        Scanner sc = new Scanner(System.in);
        int option;
        int optionEmployee;
        int optionCustomer;
        int optionFacility;
        do {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {

                case 1:
                    do {
                        System.out.println("1. Display list employee");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Delete employee");
                        System.out.println("4. Edit employee");
                        System.out.println("5. Return main menu");
                        optionEmployee = Integer.parseInt(sc.nextLine());
                        switch (optionEmployee) {
                            case 1:
                                List<Employee> listEmployee = this.employeeController.getList();
                                for (Employee employee : listEmployee) {
                                    System.out.println(employee);
                                }
                        break;


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
                                Employee employee = new Employee(nameEmployee, gender, cmndEmployee, ageEmployee,
                                        telephonenumberEmployee, emailEmployee, addressEmployee, idEmployee, levelEmployee
                                        , positionEmployee, wage);
                                this.employeeController.add(employee);
//                                System.out.println(employee);
                                break;
                            case 3:
                                Employee employee1 = new Employee();
                                this.employeeController.delete(employee1);
                                System.out.println(employee1);
                                break;
                            case 4:
                                System.out.println("1. edit name of employee");
                                String nameEmp = sc.nextLine();
                                System.out.println("2. edit gender of employee");
                                String genderEmp = sc.nextLine();
                                System.out.println("3. edit cmnd of employee");
                                int cmndEmp = Integer.parseInt(sc.nextLine());
                                System.out.println("4. edit age of employee");
                                String ageEmp = sc.nextLine();
                                System.out.println("5. edit telephone number of employee");
                                String telephonenumberEmp = sc.nextLine();
                                System.out.println("6. edit email of employee");
                                String emailEmp = sc.nextLine();
                                System.out.println("7. edit address of employee");
                                String addressEmp = sc.nextLine();
                                System.out.println("8. edit id of employee");
                                int idEmp = Integer.parseInt(sc.nextLine());
                                System.out.println("9. edit level of employee");
                                String levelEmp = sc.nextLine();
                                System.out.println("10. edit position of employee");
                                String positionEmp = sc.nextLine();
                                System.out.println("11. edit wage of employee");
                                System.out.println("12. edit wage of employee");
                                int wageEmp = Integer.parseInt(sc.nextLine());
                                Employee employee2 = new Employee(nameEmp,genderEmp,cmndEmp,ageEmp,
                                        telephonenumberEmp,emailEmp,addressEmp,idEmp,levelEmp,positionEmp,wageEmp);
                                employeeController.edit(employee2);
                                System.out.println(employee2);

                                break;
                            case 5:
                                this.displayMainViewFurama();
                                break;
                            default:
                                System.out.println("chon sai roi nhap lai di");
                        }


                    } while (optionEmployee != 5) ;
            break;
                case 2:
                    do {
                        System.out.println("1. Display customer");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4.Return main menu");
                         optionCustomer = Integer.parseInt(sc.nextLine());
                        switch (optionCustomer){
                            case 1:
                                List<Customer>  listCustomer =this.customerController.getList();
                                for (Customer customer: listCustomer  ) {
                                    System.out.println(customer);
                                }
                                break;
                            case 2:
                                System.out.println("1. enter name of customer");
                                String nameCustomer = sc.nextLine();
                                System.out.println("2. enter gender of customer");
                                String genderCustomer = sc.nextLine();
                                System.out.println("3. enter cmnd of customer");
                                int cmndCustomer = Integer.parseInt(sc.nextLine());
                                System.out.println("4. enter age of customer");
                                String ageCustomer = sc.nextLine();
                                System.out.println("5.enter telephonenumber of customer");
                                String telephonenumberCustomer = sc.nextLine();
                                System.out.println("6. enter mail of customer");
                                String emailCustomer = sc.nextLine();
                                System.out.println("7. enter address of customer");
                                String addressCustomer = sc.nextLine();
                                System.out.println("8. enter id of customer");
                                int idCustomer = Integer.parseInt(sc.nextLine());
                                System.out.println("9. enter type of customer");
                                String typeCustomer = sc.nextLine();
                                Customer customer = new Customer(nameCustomer,genderCustomer,cmndCustomer,
                                        ageCustomer,telephonenumberCustomer,emailCustomer,addressCustomer,idCustomer
                                ,typeCustomer);
                                this.customerController.add(customer);
                                System.out.println(customer);
                                break;

                            case 3:
                                System.out.println("1. edit name of customer");
                                String nameCus = sc.nextLine();
                                System.out.println("2. edit gender of customer");
                                String genderCus = sc.nextLine();
                                System.out.println("3. edit cmnd of customer");
                                int cmndCus = Integer.parseInt(sc.nextLine());
                                System.out.println("4. edit age of customer");
                                String ageCus = sc.nextLine();
                                System.out.println("5. eidt telephonenumber of customer");
                                String telephoneCus = sc.nextLine();
                                System.out.println("6. edit email of customer");
                                String emailCus = sc.nextLine();
                                System.out.println("7. edit address of customer");
                                String addressCus = sc.nextLine();
                                System.out.println("8. edit id of customer");
                                int idCus = Integer.parseInt(sc.nextLine());
                                System.out.println("9. edit type of customer");
                                String typeCus = sc.nextLine();
                                Customer customer1 = new Customer(nameCus,genderCus,cmndCus,ageCus,telephoneCus
                                ,emailCus,addressCus,idCus,typeCus);
                                customerController.edit(customer1);
//                                System.out.println(customer1);
                                break;

                            case 4:
                               this.displayMainViewFurama();
                            default:
                                System.out.println("nhap sai roi nhap lai di");
                        }


                    } while (optionCustomer!=4);
                    break;
                case 3:
                    do {
                        System.out.println("1. Display list Facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        optionFacility = Integer.parseInt(sc.nextLine());
                        switch (optionFacility){
                            case 1:
                                do {
                                    System.out.println("add new villa");
                                    System.out.println("add new room");
                                    System.out.println("back to menu");
                                    int optionVilla = Integer.parseInt(sc.nextLine());
                                    switch (optionVilla){
                                        case 1:
                                            System.out.println("1. enter id of villa");
                                            String idVilla = sc.nextLine();
                                            System.out.println("2. enter name severvice of villa");
                                            String nameServiceVilla = sc.nextLine();
                                            System.out.println("3. enter age of villa");
                                            int ageVilla = Integer.parseInt(sc.nextLine());
                                            System.out.println("4. enter cost of villa");
                                            int costVilla = Integer.parseInt(sc.nextLine());
                                            System.out.println("5. enter people of villa");
                                            int peopleVilla = Integer.parseInt(sc.nextLine());
                                            System.out.println("6. enter rental of villa");
                                            String rentalVilla = sc.nextLine();
                                            System.out.println("7. enter standard of villa");
                                            String standardVilla = sc.nextLine();
                                            System.out.println("8. enter age pool of villa");
                                            int agePoolVilla = Integer.parseInt(sc.nextLine());


//                                            String idFacility, String nameService, int age, int costs,
//                                            int people, String rental, String standard, int agePool

                                    }


                                }while (true);
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

        } while (option!=6);

    }
}


