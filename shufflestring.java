import java.util.Scanner;

public class shufflestring {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] result = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            result[i] = s.charAt(i);
        }
        System.out.println(result);
    }
}
