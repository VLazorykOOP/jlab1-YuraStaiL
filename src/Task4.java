import java.util.Scanner;
import java.util.Arrays;

//3
public class Task4 {
    public static boolean isSymmetrical(String inputStr){
            if(inputStr.length() <= 1) {
                return false;
            }

            for(int i = 0; i < inputStr.length()/2; i++) {
                if(inputStr.charAt(i) != inputStr.charAt(inputStr.length() - (i + 1)))
                {
                    return false;
                }
            }

            return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "I love Java, it is beautiful laal edttde, oikio,ede oltJtlo";

        String[] words = str.split("[,\\s]");

        System.out.println("Symmetrical words: ");

        for(int i = 0; i < words.length; i++)
        {
                if(isSymmetrical(words[i])) {
                System.out.println("[" + words[i] + "]");
                }
        }
    }
}