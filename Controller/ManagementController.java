package Controller;

import java.util.Scanner;

public class ManagementController {
    public void management() {
        Scanner sc = new Scanner(System.in);

        System.out.println("------Customer Management ------");
        System.out.println("1.\tDisplay list customers");
        System.out.println("2.\tAdd new customer");
        System.out.println("3.\tEdit customer");
        System.out.println("4.\tReturn main menu");
        int choice;

        do {

            choice = sc.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("please enter again:");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("hihi");
                    break;
                case 2:
                    System.out.println("huhu");
                    break;
                case 3:
                    System.out.println("liu liu");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("please enter again 1-4");

            }

        } while (true);
    }

}
