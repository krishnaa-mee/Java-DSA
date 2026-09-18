import java.util.Stack;

public class reversearrayusingstack {
    static void reversearray(int arr[]){

        Stack<Integer> s = new Stack<>();

        for(int i=0;i<arr.length;i++){
            s.push(arr[i]);
        }

        int i = 0;
        while(!s.isEmpty()){
            arr[i] = s.pop();
            i++;
        }

    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reversearray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
