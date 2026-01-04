package patterns;

import java.util.regex.Pattern;

public class pattern14 {
    public static void main(String[] args) {
        // Pattern 14
        // A
        // AB
        // ABC
        // ABCD
        // ABCDE
        char alpha = 'A';
        for(int i=0; i<5; i++){
            for(int j=0; j<i+1; j++){
                System.out.print((char)(alpha+j));
            }
            System.out.println();
        }
    }
}
