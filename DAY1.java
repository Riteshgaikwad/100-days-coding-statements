// Question:- Take an input character from the user and check whether the given input is vowel or consonant.
//code written in java

import java.util.Scanner;
class day1
{
 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character :");
        char c=sc.next().charAt(0);
        if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u' ){
            System.out.println("Vowel");
        }
        else if((c>='A' && c<='Z') || (c>='a' && c<='z')){
            System.out.println("Consonant");
        }
        else{
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
