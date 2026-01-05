package patterns;

import java.util.regex.Pattern;

public class pattern16 {
    public static void main(String[] args) {
        // Pattern 16
        // A
        // BB
        // CCC
        // DDDD
        // EEEEE
        char alpha = 'A';
        for(int i=0; i<5; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(alpha);
            }
            alpha++;
            System.out.println();
        }
    }
}
