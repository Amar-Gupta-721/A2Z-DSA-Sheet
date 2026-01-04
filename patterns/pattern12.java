package patterns;

public class pattern12 {
    public static void main(String[] args) {
        // Pattern 12
        // 1      1
        // 12    21
        // 123  321
        // 12344321
        for(int i=0; i<4; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(j+1);
            }
            for(int j=2*i+2; j<8; j++){
                System.out.print(" ");
            }
            for(int j=i+1; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
