package interviews;

public class Count_character {
    public static void main(String[] args) {
        String s = "Learn java Code";
        int count = 0;
        String str = " ";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' ') {
                  str=str+s.charAt(i);
                count++;
            }
        }
        System.out.println("No of character "+str);
        System.out.println("No. of character : " + count);
    }
    }


