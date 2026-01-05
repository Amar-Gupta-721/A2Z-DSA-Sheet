package patterns;

public class pattern20 {
    public static void main(String[] args) {
        // Pattern 20
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        for(int i=0; i<5; i++){
            for(int j=i; j>=0; j--){
                System.out.print("*");
            }
            for(int j=2*i; j<8; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
