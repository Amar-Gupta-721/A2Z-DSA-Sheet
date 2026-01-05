package patterns;

import java.util.regex.Pattern;

public class pattern15 {
    public static void main(String[] args) {
        // Pattern 15
        // ABCDE
        // ABCD
        // ABC
        // AB
        // A
        char alpha = 'A';
        for(int i=0; i<5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print((char)(alpha+j));
            }
            System.out.println();
        }
    }
}
