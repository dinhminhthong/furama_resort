package view;

import controller.CustomerController;
import controller.EmployeeController;
import models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
  private final EmployeeController employeeController = new EmployeeController();
  private final CustomerController customerController = new CustomerController();
   private final Scanner sc = new Scanner(System.in);
    int input;

   public void displayMainMenu(){
       do{
           System.out.println("_______Menu_________");
           System.out.println("1.Employee Management");
           System.out.println("2. Customer Management");
           System.out.println("3. Facility Management");
           System.out.println("4. Booking Management");
           System.out.println("5. Promotion Management");
           System.out.println("6.Exit");
           System.out.println("enter your option");
           input =Integer.parseInt(sc.nextLine());
           switch (input){
               case 1:
                   List<Employee> list = new ArrayList<>();
                   System.out.println(list);
                   break;

               case 2:
                   System.out.println("enter id of Employee ");
                   String idEmployee = sc.nextLine();
                   System.out.println(" enter name of Employee");
                   String nameEmployee = sc.nextLine();
                   System.out.println("enter sex of Employee");
                   String sexEmployee = sc.nextLine();
                   System.out.println("enter CMND of Employee");
                   String cmndEmployee = sc.nextLine();
                   System.out.println("enter email of Employee");
                   String email = sc.nextLine();
                   System.out.println("enter type of Employee");
                   String typeEmployee = sc.nextLine();
                   System.out.println("enter address of Employee");
                   String addressEmployee = sc.nextLine();
                   System.out.println("enter salary of Employee");
                   long salaryEmployee =Long.parseLong(sc.nextLine());

                   break;
           }

       }while (true);
   }

}
