// package DSA;
import java.util.*;
public class table {
    public static void m1(int a) {
        for (int i=1; i<=10; i++) {
            int multiple= a*i;
            System.out.println(a+" * "+i+" = "+multiple);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter a number, you want to print with table");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        m1(a);
    }   
}
