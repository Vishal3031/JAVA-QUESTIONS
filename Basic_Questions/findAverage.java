//Enter 3 numbers from the user and make a function to print their average.

// package DSA;
import java.util.*;

public class findAverage {
    public static int maa(int a, int b, int c) {
        int n=3, sum, average;
        sum= a+b+c;
        average = sum/n;
        return average;
    }
    public static void main(String[] args) {
        System.out.print("Enter three numbers to find average \n");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();

        System.out.print("average of three numbers are "+maa(a,b,c));
    }
}
