package patterns;

public class pattern3 {
    public static void main(String[] args) {
        // Pattern 3
        // 1    
        // 12
        // 123
        // 1234
        // 12345
        for(int i=0; i<5; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(j+1);
            }
            for(int j=i+1; j<5; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
