//print a table

// package DSA;
import java.util.Scanner;
public class qsnn {
    
    public static void main(String[] args) {
        int table=0;

        System.out.println("enter a number, you want to print with table");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();

        for (int i=1; i<=10; i++) {
            table= a*i;
            // System.out.println(a*i);
            System.out.println(a+" + "+i+" = "+table);
        }
    }
}
