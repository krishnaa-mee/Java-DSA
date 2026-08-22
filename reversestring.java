import java.util.*;
public class reversestring {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

//        reverse
        String reverse = "";
        for (int i= str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reversed string is: " + reverse);
    }
}
