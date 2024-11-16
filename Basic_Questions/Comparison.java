//comparison , a==b, a<b, a>b

// package DSA;
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter two number:");

        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();

        if(a==b) {
            System.out.println(a+" is equal to "+b);
        }
        else if(a<b) {
            System.out.println(a+" is less than "+b);
        }else {
            System.out.println(a+" is greater than "+b);
        }
    }
}
