import java.util.Scanner;
public class sparsematrix {
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
        System.out.println("display matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int zerocount = 0;
//        COUNT ZERO
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    zerocount++;
                }
            }
        }

        if(zerocount > (m*n)/2){
            System.out.println("Sparse Matrix");
        }
        else{
            System.out.println("Not Sparse Matrix");
        }
    }
}
