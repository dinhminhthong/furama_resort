package Controller;

import java.util.Scanner;

public class BookingController {
    public void book() {
        Scanner sc = new Scanner(System.in);

        System.out.println("------Booking Management------");
        System.out.println("1.\tAdd new booking");
        System.out.println("2.\tDisplay list booking");
        System.out.println("3\tReturn main menu");
        int choice;

        do {

            choice = sc.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("please enter again:");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println();

                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("please enter again 1-3");

            }

        } while (true);
    }
}
