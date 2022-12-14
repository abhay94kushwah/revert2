package interviews;

import java.util.Scanner;

public class Prime_numbers {
    public static void main(String[] args) {
        int n=7,count=0;
        System.out.println("Enter any no. ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
                           // the no. whose divided only by 1 and itself known as prime no.
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime no. ");
        }
        else{
            System.out.println("Not a prime no. ");
        }
    }
}
