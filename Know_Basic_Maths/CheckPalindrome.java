package Know_Basic_Maths;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        if(x<0)return false;
        int rev = 0;
        int n = x;
        while(n!=0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        return rev == x;
    }
}
