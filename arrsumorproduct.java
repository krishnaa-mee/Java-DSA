import java.util.Scanner;
public class arrsumorproduct {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size= sc.nextInt();
        int arr[] = new int[50];
        System.out.println("enter the element of array:");
        for ( int i = 0; i < size; i++)
        {
            arr[i]=sc.nextInt();
            System.out.println(arr[i]);
        }
        int evensum=0;
        int oddproduct=1;
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                evensum+=arr[i];
            }
            else
            {
                oddproduct*=arr[i];
            }
        }
        System.out.println("sum of even element:");
        System.out.println(evensum);
        System.out.println("product of odd element:");
        System.out.println(oddproduct);
    }

}
