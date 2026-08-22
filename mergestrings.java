import java.util.*;
public class mergestrings {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        String str2= sc.nextLine();

        String result ="";
        int i =0;
        int j =0;
        while(i<str1.length() || j<str1.length()){
            if(i< str1.length())
            {
                result = result + str1.charAt(i);
                i++;

            }
            if(j< str1.length())
            {
                result = result + str2.charAt(j);
                j++;
            }
        }
        System.out.print(result);

    }
}
