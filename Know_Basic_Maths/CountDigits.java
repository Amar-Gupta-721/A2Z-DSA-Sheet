package Know_Basic_Maths;

public class CountDigits {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(method_1(n));
        System.out.println(method_2(n));
        System.out.println(method_3(n));
    }

    public static int method_1(int n){
        int count = 0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static int method_2(int n){
        return Integer.toString(n).length();
    }

    public static int method_3(int n){
        if(n==0)return 0;
        return 1+method_3(n/10);
    }
}
