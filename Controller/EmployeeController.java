package Controller;

import java.util.Scanner;

public  class EmployeeController {
    public void employee(){
        Scanner sc = new Scanner(System.in);

        System.out.println("------Employee Management------");
        System.out.println("1\tDisplay list employees");
        System.out.println("2\tAdd new employee");
        System.out.println("3\tDelete employee");
        System.out.println("4\tEdit employee");
        System.out.println("5\tReturn main menu");

        int choice;

        do {

            choice = sc.nextInt();
            if (choice < 1 || choice > 5) {
                System.out.println("please enter again:");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("hihi");

                    break;
                case 2:
                    System.out.println("abc\nabc");;

                    break;
                case 3:
                    System.out.println("liu liu");
                    break;
                case 4:
                    System.out.println("byebye");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("please enter again 1-5");

            }
        } while (true);

    }
}