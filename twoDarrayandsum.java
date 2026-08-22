import java.util.Scanner;
public class twoDarrayandsum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("sum="+sum);
    }
}
