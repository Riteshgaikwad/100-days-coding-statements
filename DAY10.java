//Question:-Get a number from user for which you need to find the factorial, then calculate the factorial and give it as 
the output.
//Solution in java

import java.util.Scanner;
class day10{
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int factorial=1;
        for(int i=num;i>0;i--){
            factorial=factorial*i;
        }
        System.out.println("factorial is:"+factorial);
        sc.close();
    }
}
