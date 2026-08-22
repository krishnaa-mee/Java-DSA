import java.util.Scanner;
public class twodrowsum {
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
        int sum = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                sum += arr[i][j];
            }
            System.out.println("sum of row "+i +" = " + sum);
            sum = 0;
        }

    }

}
