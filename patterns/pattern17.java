package patterns;

import java.util.regex.Pattern;

public class pattern17 {
    public static void main(String[] args) {
        // Pattern 18
        //     A
        //    ABA
        //   ABCBA
        //  ABCDCBA
        char alpha = 'A';
        for(int i=0; i<4; i++){
            for(int j=0; j<5-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print((char)(alpha+j));
            }
            for(int j=i-1; j>=0; j--){
                System.out.print((char)(alpha+j));
            }
            System.out.println();
        }
    }
}
