import java.util.Scanner;
public class lostrollno {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        int index = -1;
        System.out.println("enter roll no:");
        int X = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            if (arr[i] == X)
            {
                index = i;
                break;
            }
        }
        System.out.println(index);



    }
}
