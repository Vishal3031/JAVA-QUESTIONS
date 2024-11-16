// print the greeting, 1 to hello, 2 to namaste, 3 to bonjour 

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int Greeting;

        System.out.println("enter number for greeting");
        Scanner obj=new Scanner(System.in);
        Greeting=obj.nextInt();

        switch(Greeting) {
            case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Namaste");
            break;
            case 3:
            System.out.println("Bonjour");
            break;
            default: 
            System.out.println("non-of these");
        }
    }
}
