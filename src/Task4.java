import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


//3
public class Task4 {

    public static String reverseString(String inputString) {
        int stringLength = inputString.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "I love Java laal edttde";
        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++)
        {
                if((words[i].length() % 2) != 0) {
                    continue;
                }

                if(words[i].substring(0,words[i].length()/2).equals(reverseString(words[i].substring(words[i].length()/2)))) {
                    System.out.println(words[i]);

                    System.out.println("----");
                }
            
        }
    }
}