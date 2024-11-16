//Write a function to multiply 2 numbers.
// package DSA;
import java.util.Scanner;

public class function {
    public static void vishal(int a, int b) {
        // int sum= a*b;
        // return sum;
        System.out.print(a*b);
        return ;    //you can give this without passing any value
    }
    public static void main(String[] args) {
        System.out.println("Enter two number:");
        Scanner obj=new Scanner(System.in);
        int a= obj.nextInt();
        int b=obj.nextInt();

        vishal(a,b);
        // System.out.print(vishal(a,b));
    }
}
