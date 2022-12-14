package interviews;

public class Swap_numbers {
    public static void main(String[] args){  //using third variable
        int a=12;
        int b=34;
        int temp;
        System.out.println("Before swap : " +a +","+b);

        temp=a;
        a=b;
        b=temp;

          System.out.println("After swap : " +a +","+b);

        //without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("withot using third variable : " +a+","+b);
    }// we can also swap variables with xor(^) operator
     //a=a^b;
    //b=a^b;
    //a=a^b;
}
