//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
//Try to convert it into a function on your own.

package DSA.Exercise_1;
import java.util.Scanner;

public class convertINTOfunction {

    public static int vishal(int x, int n) {
        int result = 1;
        for (int i=1; i<=n; i++) {

            result=result*x;
        }
        return result;
    }
    
    
    public static void main(String[] args) {

        System.out.print("Enter x\n");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        System.out.print("Enter n\n");
        int n=obj.nextInt();

        System.out.print("X power n is: "+vishal(x,n));

    }
}
