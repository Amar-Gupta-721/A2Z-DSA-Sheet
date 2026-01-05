package patterns;

import java.util.regex.Pattern;

public class pattern18 {
    public static void main(String[] args) {
        // Pattern 18
        // E
        // DE
        // CDE
        // BCDE
        // ABCDE
        char alpha = 'E';
        for(int i=0; i<5; i++){
            for(int j=i; j>=0; j--){
                System.out.print((char)(alpha-j));
            }
            System.err.println();
        }
    }
}
