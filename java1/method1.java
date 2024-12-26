import java.util.Scanner;

class algebra{
int add (int a ,int b){
    int ans = a+b;
    return ans;
}
}
public  class method1 {

    public static void main(String[] args) {
        algebra obj = new algebra();
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println("numbers");
       
         int ans =obj.add( a, b);
         System.out.println("sum" +ans);
    }
}