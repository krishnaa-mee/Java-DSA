public class methods {
//    declaration/definition
    static void print2table() {
        for(int i = 1; i<=10; i++){
            int ans = 2*i;
            System.out.println("-> " + ans);
        }
    }
    static void printsum(int x, int y) {
        System.out.println("SUM " + (x + y));

    }
    static int add(int p, int q) {
        int sum = p + q;
        return sum;
    }
    static int add(int p, int q,int r) {
        int ans = p + q + r;
        return ans;
    }

    static void main(){
////        Method overloading
//        int ans1 = add(1,2);
//        int ans2 = add(2,3,3);
//        System.out.println("ans1 = " + ans1);
//        System.out.println("ans2 = " + ans2);

//        int result = add(13,2);
//        System.out.println(result);
//        printsum(1,2);
//        System.out.println("hi");
//    method call
//        print2table();
//        System.out.println("bye");
  }
}
