import java.util.Scanner;

public class greatestnumber {
    static void main() {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the two numbers");
//        int a,b;
//        a=sc.nextInt();
//        b=sc.nextInt();
//        if(a>b){
//            System.out.println(a + " is greater number");
//        }
//        else{
//            System.out.println(b + " is the greater number");
//        }

        System.out.println("Enter the three numbers:");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a>b&&a>c){
            System.out.println("The greatest number is "+a);
        }
        else if(b>a&&b>c){
            System.out.println("the greatest number is "+b);
        }
        else if(c>a&&c>b){
            System.out.println("the greatest number is "+c);
        }
        else{
            System.out.println("all number are equal");
        }
    }
}
