import java.util.*;
public class stringpalindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int left  = 0;
        int right = str.length() - 1;
        boolean palindrome = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                palindrome = false;
                break;
            }
                left++;
                right--;
        }
        if (palindrome) {
            System.out.println("palidrome");
        }
        else {
            System.out.println("not palidrome");
        }
    }

}
