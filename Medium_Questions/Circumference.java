//write a function that takes in the radius as input and returns the circumference of a circle.

package DSA.Exercise_1;
import java.util.*;

public class Circumference {

    public static double vishal(double radius) {

        double pi= 3.14;
        double circumference= 2*pi*radius;   //this is formula for finding cicumference

        return circumference;

    }
    
    public static void main(String[] args) {

        System.out.print("enter the number for finding cicumference\n");

        Scanner obj=new Scanner(System.in);
        double radius=obj.nextInt();

        System.out.print(vishal(radius));


    }
}
