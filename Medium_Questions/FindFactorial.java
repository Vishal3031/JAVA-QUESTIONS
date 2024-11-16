//Write a function to calculate the factorial of a number.

package DSA.Exercise_1;
import java.util.*;
public class FindFactorial {

    public static void rahul(int a) {

        if (a<0) {
            System.out.print("invalid number");
            return ;
        }
        int factorial=1;
        for(int i=a; i>=1; i--) {
            factorial= factorial*i;
        }
        System.out.print("Factorial is: "+factorial);
        return ;


    }
    
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();

        rahul(a);

    }
}
