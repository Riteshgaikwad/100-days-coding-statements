//Question:-Take an integer as the input from the user and then calculate the number of digits in the given input and print it as the output.
//Solution in java

import java.util.Scanner;
class day9{
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int count=0;
        if(num==0){
            count=1;
            System.out.println("The number of digit present are:"+count);
        }
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("The number of digit present are:"+count);
        sc.close();
    }
}
