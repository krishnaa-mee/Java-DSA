import java.util.Scanner;
public class twoDdiagonalsum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
            int d1= 0;
            int d2= 0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(i==j)
                    {
                        d1+=arr[i][j];
                    }
                if(i+j==n-1)
                {
                    d2+=arr[i][j];
                }
            }
        }
            System.out.println(d1);
            System.out.println(d2);

    }
}
