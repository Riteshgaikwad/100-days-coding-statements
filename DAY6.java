//Question:-Get the value of x and y coordinates as input from the user and check in which quadrant the point lies and print it.
//Solution in java

import java.util.Scanner;
class day6{
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the x co-ordinates:");
        int x=sc.nextInt();
        System.out.printf("Enter the  y co-ordinates:");
        int y=sc.nextInt();
        if(x>0 && y>0){
            System.out.println("First Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("Second Quadrant");

        }
        else if(x<0 && y<0){
            System.out.println("Third Quadrant");
        }
        else{
            System.out.println("Fourth Quadrant");
        }
        sc.close();
    }
}
