//write a function that takes in age as input and returns if that person is eligible to vote or not. a person of age > 18 is eligible to vote.

package DSA.Exercise_1;
import java.util.*;

public class age {

    public static boolean vote(int age) {

        return age>18;
        
    }
    
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        int age=obj.nextInt();

        Boolean Eligible= vote(age);  //if true then

        if(Eligible) {
            System.out.print("you are eligible for vote");
        }else{
            System.out.print("you are not eligible for vote");
        }


    }
}
