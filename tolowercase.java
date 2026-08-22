import java.util.*;
public class tolowercase {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
                String result = "";

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    if (ch >= 'A' && ch <= 'Z') {
                        ch = (char)(ch + 32);
                    }

                    result = result + ch;
                }

                System.out.println("Lowercase is : " + result);


    }
}
