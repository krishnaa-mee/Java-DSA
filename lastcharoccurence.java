import java.util.*;
public class lastcharoccurence {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter the charater:");
        char ch = sc.next().charAt(0);

        int last = -1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                last = i;
            }
        }
        System.out.println("The last occurence of " + str + " is " + last);
    }
}
