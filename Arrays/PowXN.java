package Arrays;

public class PowXN {
    public static void main(String[] args) {
        System.out.println(myPow(2, 5));
    }
 
    public static double myPow(double x, int n) {
        double ans = 1;
        double m = n;       // last case n = -2147483648
        if(n<0) m = m * (-1);
        while(m>0){
            if(m%2==0){
                m = m/2;
                x = x * x;
            }
            else{ 
                m--;
                ans = ans * x;
            }
        }
        return n<0?1/ans:ans;
    }
}