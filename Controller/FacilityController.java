package Controller;

import java.util.Scanner;

public class FacilityController {
    public void facility(){
        Scanner sc = new Scanner(System.in);

        System.out.println("------Facility Management  ------");
        System.out.println("1\tDisplay list facility");
        System.out.println("2\tAdd new facility");
        System.out.println("3\tDisplay list facility maintenance");
        System.out.println("4\tReturn main menu");
        int choice;

        do {

            choice = sc.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("please enter again menu 2:");
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