import java.util.Scanner;

public class shufflestring {

    static String shuffle(String s, int[] indices){
        char[] result = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = in.nextLine();

        int[] indices = new int[s.length()];

        System.out.println("Enter" +s.length()+ "indices:");

        for (int i = 0; i < s.length(); i++) {
            indices[i] = in.nextInt();
        }
        String result = shuffle(s, indices);
        System.out.println("The shuffled string is: " + result);
    }
}
