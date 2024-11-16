//write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

package DSA.Exercise_1;
// import java.util.*;

// public class exercise {

//     public static void vishal(int n) {


//     }
    
//     public static void main(String[] args) {

//         System.out.print("Enter the number\n");
//         Scanner obj=new Scanner(System.in);
//         int n=obj.nextInt();




//     }
// }


import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (true) {
            System.out.println("Enter a number (or type 'exit' to finish):");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                
                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);

        scanner.close();
    }
}

