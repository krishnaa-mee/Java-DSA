public class methodshomework {
    static void welcomemessage(){
        System.out.println("Hello and Welcome !! ");
    }
    static int add(int a, int b){
        int ans = a + b;
        return ans;
    }
    static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    static int GetMaximum(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }

    }
    static float CALCULATEPERCENTAGE(int obtained ,float total){
        float ans = (obtained/total)*100;
        return ans;

    }
    static int display(int a){
        return a;
    }
    static void display(String str){
        System.out.println(str);
    }
//    call by value
    static void updatevalue(int x){
        x = x*10;
        System.out.println(x);
    }

    static void main(){
        welcomemessage();
        int result = add(1,2);
        System.out.println("sum is "+ result);
        System.out.println(isEven(8));
        int largest = GetMaximum(3,4);
        System.out.println("largest is "+ largest);
        float percentage = CALCULATEPERCENTAGE(400,600);
        System.out.println("percentage is "+ percentage);

        System.out.println(display(6));
        display("hello mee !!");
        int x= 6;
        System.out.println("num is "+ x);
        updatevalue(7);
        System.out.println("num is "+ x);
    }
}
