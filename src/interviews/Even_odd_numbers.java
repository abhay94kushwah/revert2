package interviews;

import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class Even_odd_numbers {
    public static void main(String[] args) {
        System.out.println("Enter any no.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n%2==0){
            System.out.println("it is an even number");
        }
        else{
            System.out.println("it is an odd number");
        }

    }
}
