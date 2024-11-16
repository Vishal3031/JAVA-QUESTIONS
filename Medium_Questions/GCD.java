//Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)


package DSA.Exercise_1;
import java.util.*;

public class GCD {

    public static int vihaan(int a, int b) {
        
        while (a != b) {

            if(a>b) {
                a=a-b;
                // return a;
            }else {
                b=b-a;
            }

        }
        return a;
    }
    
    public static void main(String[] args) {

        System.out.print("Enter 1st number \n");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        System.out.print("Enter 2nd nuber to find GCD\n");
        Scanner obj2=new Scanner(System.in);
        int b=obj2.nextInt();

        System.out.print(vihaan(a,b));

    }
}
