import java.util.Arrays;
import java.util.Scanner;
public class printstring {
    static void main() {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.toLowerCase(arr[i]);
        }
        System.out.println("string is :");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);


        System.out.println("\\n");
        System.out.println("\\0");


    }

}
