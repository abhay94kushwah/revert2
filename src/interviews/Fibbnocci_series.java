package interviews;

public class Fibbnocci_series {
    public static void main(String[] args) {
        int n1=0,n2=1,sum,count=8;
        System.out.print(n1+","+n2);
        for(int i=2;i<count;i++){
            sum=n1+n2;
            System.out.print(","+sum);
            n1=n2;
            n2=sum;
        }//in this series the next no. of this series are the sum of previous two no.like 0 and 1
    }
}
