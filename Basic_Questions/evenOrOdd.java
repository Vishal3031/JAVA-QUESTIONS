// Write a function to check if a given number n is even or ODD. 
// package DSA;
import java.util.*;

public class evenOrOdd {

    public static void vihaan(int a) {

        if (a%2==0) {
            System.out.print("number is even");
        }else{
            System.out.print("number is ODD");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter a number you want to that number is even or odd");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        vihaan(a);
    }
}
