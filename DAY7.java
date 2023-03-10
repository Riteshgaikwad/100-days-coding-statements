//Question:-Get the number of month and year as input from the user and check the number of days present in that month.
//Solution in java

import java.util.Scanner;
class day7{
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month:");
        int month = sc.nextInt();
        System.out.printf("Enter the year:");
        int year = sc.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Days:-31");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Days:-30");
        } else {
            if ((month == 2 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                System.out.println("Days:-29");
            } else {
                System.out.println("Days:-28");
            }
        }
        sc.close();
    }

}
