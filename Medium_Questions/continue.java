//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

package DSA.Exercise_1;
import java.util.Scanner;

class continua {

    public static void main(String[] args) {

        int positive=0;
        int negetive=0;
        int Zeros=0;  

        System.out.print("press 1 to continue and 0 to STOP\n");
        Scanner obj=new Scanner(System.in);
        int input=obj.nextInt();


        while(input==1) {

            System.out.print("Enter your number\n");
            Scanner obj2=new Scanner(System.in);
            int number=obj2.nextInt();

            if(number>0) {
                positive++;
            }else if (number<0) {
                negetive++;
            }else {
                Zeros++;
            }

            System.out.print("Enter 1 to continue and 0 to STOP\n");
            input=obj.nextInt();

        }

        System.out.println("positive is: "+positive);
        System.out.println("Negetive is: "+negetive);
        System.out.println("Zeroes is: "+Zeros);




    }
}