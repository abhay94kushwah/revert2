package interviews;

public class Armstrong_no {
    public static void main(String[] args) {
        int n=370,rem,result=0;//a qube of individual no.'s sum is an Armstrong no.
        int temp=n;
        while (n>0){
            rem=n%10;
            n=n/10;
            result=result+(rem*rem*rem);
        }
        if(temp==result){
            System.out.println("Armstrong no. ");
        }
        else{
            System.out.println("Not an Armstrong no ");
        }
    }
}
