// package DSA;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int A=2, check;
        System.out.println("enter a number that you want to check PRIME/EVEN");
        Scanner obj= new Scanner(System.in);
        int B=obj.nextInt();

        check= B%A;

        // if(B%A==0)
        if(check==0) {
            System.out.println("EVEN number Found");
        } else{
            System.out.println("ODD number is found");
        }
    }
}
