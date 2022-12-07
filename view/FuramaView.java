package view;

import controller.CustomerController;
import controller.EmployeeController;
import controller.FacilityController;
import models.Facility.Villa;
import models.person.Customer;
import models.person.Employee;
import service.extend.ICustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuramaView {
    private final EmployeeController employeeController = new EmployeeController();
    private final CustomerController customerController =new CustomerController();

    private final FacilityController facilityController = new FacilityController();
     private final Scanner sc = new Scanner(System.in);


    public void displayMainMenu() {
        do {
            System.out.println("_________Menu_________");
            System.out.println("1.Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6.Exit");
            System.out.println("enter your option");
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    //TODO Employee management
                    do {
                        System.out.println("-----------------------");
                        System.out.println("1.Display list employees");
                        System.out.println("2.Add new employee");
                        System.out.println("3.Delete employee");
                        System.out.println("4.Edit employee");
                        System.out.println("5.Return main memu ");
                        System.out.println("Enter your input: ");

                        int inputEmployee = Integer.parseInt(sc.nextLine());

                        switch (inputEmployee) {
                            case 1:

                                List<Employee>listCustomer =this.employeeController.getList();
                                for (Employee employee:listCustomer) {
                                    System.out.println(employee);
                                }
                                break;
                            case 2:
                                System.out.println("enter name of employee ");
                                String nameEmployee = sc.nextLine();
                                System.out.println("enter gender of employee");
                                String genderEmployee = sc.nextLine();
                                System.out.println("enter cmnd of employee");
                                int cnmd = Integer.parseInt(sc.nextLine());
                                System.out.println("enter age of employee");
                                String ageEmployee = sc.nextLine();
                                System.out.println("enter telephone of employee");
                                String telephonenumberEmplpyee = sc.nextLine();
                                System.out.println(" enter emial of employee");
                                String email = sc.nextLine();
                                System.out.println("enter address of employee");
                                String addressEmployee = sc.nextLine();
                                System.out.println("enter id of employee");
                                int idEmployee = Integer.parseInt(sc.nextLine());
                                System.out.println("enter level of employee");
                                String levelEmployee = sc.nextLine();
                                System.out.println("enter position of employee");
                                String positionEmployee = sc.nextLine();
                                System.out.println("enter wage of employee");
                                int wage = Integer.parseInt(sc.nextLine());
                               Employee employee = new Employee(nameEmployee, genderEmployee, cnmd, ageEmployee,
                                        telephonenumberEmplpyee, email, addressEmployee,
                                       idEmployee, levelEmployee, positionEmployee
                                        , wage);
                                employeeController.add(employee);
                                break;

                            case 3:
                                Employee employee1=new Employee();
                                this.employeeController.delete(employee1);
                                break;
                            case 4:
                                //TODO Edit employee

                               System.out.println("enter edit cmnd of emplyee");
                               int cmnd =Integer.parseInt(sc.nextLine());
                               System.out.println("enter edit ege of employee");
                               String age = sc.nextLine();
                              Employee employee2 =new Employee();
                              employeeController.edit(employee2);
                               break;
                            case 5:
                                this.displayMainMenu();
                        }
                    } while (true);
                case 2:
                    //TODO Customer Management
                    do{
                        System.out.println("1.Display list customer");
                        System.out.println("2.Add new customer");
                        System.out.println("3.Edit customer");
                        System.out.println("4.Return main menu");
                        System.out.println("5. Enter your input");
                        int inputCustomer= Integer.parseInt(sc.nextLine());
                        switch (inputCustomer){
                            case 1:
                                List<Customer>listCustomer =this.customerController.getList();
                                for (Customer customer:listCustomer) {
                                    System.out.println(customer);
                                }
                                break;
                            case 2:
                                System.out.println("enter name of customer");
                                String nameCustomer = sc.nextLine();
                                System.out.println("enter gender of customer ");
                                String genderCustomer = sc.nextLine();
                                System.out.println("enter cmnd of customer");
                                int cmnd = Integer.parseInt(sc.nextLine());
                                System.out.println("enter age of customer");
                                String age = sc.nextLine();
                                System.out.println("enter telephone of customer");
                                String telephoneCustomer = sc.nextLine();
                                System.out.println("enter email of customer ");
                                String emailCustomer = sc.nextLine();
                                System.out.println("enter address of customer");
                                String addressCustomer =sc.nextLine();
                                System.out.println("enter id of customer");
                                int idCustomer = Integer.parseInt(sc.nextLine());
                                System.out.println("enter type of customer");
                                String typeCustomer = sc.nextLine();
                                Customer customer =new Customer(nameCustomer,genderCustomer,cmnd
                                ,age,telephoneCustomer,emailCustomer,addressCustomer,idCustomer,typeCustomer);
                                this.customerController.add(customer);
                                break;
                            case 3:
                                System.out.println("enter edit age of customer");
                                String ageCustomer =sc.nextLine();
                                System.out.println("enter edit address of customer");
                                String addressCustomer1 = sc.nextLine();
                                Customer customer1 =new Customer();
                                customerController.edit(customer1);
                                break;
                            case 4:
                                this.displayMainMenu();
                                break;
                        }

                    }while (true);
                case 3:
                    //TODO Facility Management
                       do{
                           System.out.println("Add new villa");
                           System.out.println("Add new Room");
                           System.out.println("Back to menu");
                           int inputFacility = Integer.parseInt(sc.nextLine());
                           switch (inputFacility){
                               case 1:
                                   System.out.println("1.enter id of villa");
                                   String idVill = sc.nextLine();
                                   System.out.println("2.enter name of villa");
                                   String nameVill = sc.nextLine();
                                   System.out.println("3. enter age of villa");
                                   int ageVill = Integer.parseInt(sc.nextLine());
                                   System.out.println("4. enter cost of villa");
                                   int costVill = Integer.parseInt(sc.nextLine());
                                   System.out.println("5.enter peopler of villa");
                                   int peopleVill = Integer.parseInt(sc.nextLine());
                                   System.out.println("6. enter rental of villa");
                                   String rentalVill = sc.nextLine();
                                   System.out.println("7. enter standard of villa");
                                   String standardVill = sc.nextLine();
                                   System.out.println("8. enter agePool of villa");
                                   int agePoolVill = Integer.parseInt(sc.nextLine());
                                   Villa villa = new Villa(idVill,nameVill,ageVill,costVill
                                   ,peopleVill,rentalVill,standardVill,agePoolVill);
                                   this.facilityController.addVilla(villa);
                                   break;
                               case 2:
                                   // todo room
                               case 3:
                                   // back to menu
                                   this.displayMainMenu();
                               default:
                                   System.out.println("Inalid");


//                                   String idFacility, String nameService, int age, int costs,
//                                   int people, String rental, String standard, int agePool

                           }

                       }while (true);

                case 4:
                    //TODO Booking Management
                case 5:
                    //TODO Promotion Management
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Nhap sai option > 6");
            }
        } while (true);
    }
}

