// write a function to check if a number is prime.

import java.util.*;
public class primeOrNot {
    public static void kunal(int a) {
        
        if (a%2 !=0 || a==2) {
            System.out.print("number is prime");
        } else {
            System.out.print("number is not prime");
        }
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter two number You want to know, number is prime or not");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();

        kunal(a);
    }

}
