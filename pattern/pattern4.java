package pattern;

public class pattern4 {
    public static void main(String[] args) {
        // Pattern 4
        // 1    
        // 22
        // 333
        // 4444
        // 55555
        for(int i=0; i<5; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(i+1);
            }
            for(int j=i+1; j<5; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
