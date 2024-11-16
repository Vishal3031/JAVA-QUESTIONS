// print the sum of the first n natural numbers.

// package DSA;
import java.util.Scanner;
public class whll {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("enter number you want to print sum of first n natural number");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        
        for (int i=1; i<=n; i++) {
            sum += i; 
            // sum=sum+ i;
        }
        System.out.println(sum);
    }
}
