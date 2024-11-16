// package DSA;
import java.util.Scanner;

public class baisc {
    public static void main(String[] args)
    {
        int sum;
        System.out.println("enter two integer number");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();

        sum =a+b;
        System.out.println(a+" + "+b+" = "+sum);
    }
}
