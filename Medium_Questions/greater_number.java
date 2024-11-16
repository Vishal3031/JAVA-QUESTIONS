//write a function which takes in 2 numbers and returns the greater of those two.

package DSA.Exercise_1;
import java.util.*;

public class greater_number {

    public static int koila(int x, int y) {

        if (x>y) {
            return x;
        }else{
            return y;        
        }
    }
    
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();

        int greater=koila(x, y);
        System.out.print("the greatest value of two number first "+x+" second "+y+" is "+greater); 
    }
}
