package interviews;

public class Reverse_Each_word {
    public static void main(String[] args) {
        String s="i am java code";
        String[] arr=s.split(" ");
        String result="";

        for (String word :arr) {

            int j=word.length()-1;
            String reverseword="";
            while (j>=0){
                char ch=word.charAt(j);
                reverseword=reverseword+ch;
                j--;
            }
            result=result+reverseword+" ";
        }
        System.out.println(result);

        }

}
