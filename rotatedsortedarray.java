import java.util.Scanner;
public class rotatedsortedarray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0 ;
        for(int i = 0; i < n; i++){
            if(arr[i] > arr[(i+1)%n]){
                count++;
            }
        }
        if(count <= 1){
            System.out.println("rotated sorted");
        }
        else{
            System.out.println("Not sorted and rotated");
        }

    }
}
