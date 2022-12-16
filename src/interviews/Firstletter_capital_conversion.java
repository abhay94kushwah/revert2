package interviews;

public class Firstletter_capital_conversion {
    public static void main(String[] args) {
        String s="i am java code";
        System.out.println(s);
        String[] arr=s.split(" ");
        String result="";
        for (String word : arr) {
            result=result+word.substring(0,1).toUpperCase()+word.substring(1,word.length())+" ";
        }
        System.out.print(result);
    }
}
