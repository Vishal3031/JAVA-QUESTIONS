//write a function to print the sum of all odd numbers from 1 to n

package DSA.Exercise_1;
import java.util.*;

public class sumOFodd {
    // public int sum;
    
    public static void bishu(int x) {

        int sum=0;
        for(int i=1; i<=x; i++) {

            if(i%2 !=0) {

                sum+=i;  //sum=sum+i
            }

        }
        System.out.print(sum);

        return;
    }

    public static void main(String[] args) {

        System.out.print("Enter value for sum of odd number\n");

        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();

        bishu (x);

    }
}
