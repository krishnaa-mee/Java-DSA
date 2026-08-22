import java.util.Scanner;
public class happynumber {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check:");
        int n= sc.nextInt();

        while (n!=1 && n!=4){
             int sum=0;

             while(n>0)
             {
                int digit=n%10;
                sum=sum+digit*digit;
                n=n/10;
             }
             n=sum;

        }

        if (n==1)
        {
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not Happy Number");
        }

    }

}
