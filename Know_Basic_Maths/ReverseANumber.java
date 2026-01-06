package Know_Basic_Maths;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse(15342369));
    }

    public static int reverse(int x) {
        int revNum = 0;
        while(x!=0){
            int rem = x%10;
            revNum = revNum*10 + rem;
            x = x/10;
        }
        return x<0?-1*revNum:revNum;
    }
}
