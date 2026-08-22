import javax.swing.*;
import java.util.*;
public class vowelandconsonant {
    public static void count(String str) {
        int vowel = 0;
        int consonant = 0;
        String ref = "aeiouAEIOU";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (ref.indexOf(ch) != -1)
                    vowel++;
                else
                    consonant++;
            }
        }
        System.out.println("vowel: " + vowel + "\n consonant: " + consonant);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        count(str);
    }
}
