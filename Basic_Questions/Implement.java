// package DSA;

import java.util.Scanner;
class LifeLines {    //Use default if the class is only part of the internal workings of a package and doesn’t need to be visible to others.
    int t, i;

    public void men() {
        System.out.println("Do You Have A Problem In Life");
        System.out.println("1 for YES:");
        System.out.println("2 for NO:");

        Scanner o=new Scanner(System.in);
        t=o.nextInt();

        if ( t==1) {
            System.out.println("\nCAN YOU DO SOMETHING ABOUT IT?");
            System.out.println("1 for YES:");
            System.out.println("2 for NO:");

            Scanner g=new Scanner(System.in);
            i=g.nextInt();
            if(i==1) {
                System.out.print("\nTHEN WHY WORRY?");
            } else{
                System.out.print("\nTHEN WHY WORRY?");
            }
        } else {
            System.out.print("\nTHEN WHY WORRY?");
        }
    }
}
public class Implement {    //Use public if the class is meant to be shared or used widely across packages.
    public static void main(String[] args) {
        LifeLines r=new LifeLines();
        r.men();
    }
}