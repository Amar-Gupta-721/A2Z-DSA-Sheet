package patterns;

public class pattern11 {
    public static void main(String[] args) {
        // Pattern 11
        // 1
        // 01
        // 101
        // 0101
        // 10101
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                if((i+j)%2!=0)System.out.print(0);
                else System.out.print(1);
            }
            System.out.println();
        }
    }
}
