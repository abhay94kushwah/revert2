package interviews;

public class Reverse_Sentence_string {
    public static void main(String[] args) {
        String str="i am java code";
        String[] arr=str.split(" ");
        String result="";

        for (int i= arr.length-1;i>=0;i--){
            result=result+arr[i]+" ";
        }
        System.out.println(result);
    }
}
