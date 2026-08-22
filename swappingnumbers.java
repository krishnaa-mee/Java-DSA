import java.util.Scanner;
public class swappingnumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);

//        using third variable...
//        System.out.println("Enter the number A:");
//        int A = sc.nextInt();
//        System.out.println("Enter the number B:");
//        int B = sc.nextInt();
//
//        int temp;
//        temp=A;
//        A=B;
//        B=temp;
//
//        System.out.println("after swapping:");
//        System.out.println("A=" +A);
//        System.out.println("B=" +B);

        System.out.println("Enter the number A:");
        int numA = sc.nextInt();
        System.out.println("Enter the number B:");
        int numB = sc.nextInt();

        numA = numA + numB;
        numB = numA - numB;
        numA = numA - numB;

        System.out.println("after swapping:");
        System.out.println("A=" +numA);
        System.out.println("B=" +numB);
        sc.close();

    }
}
