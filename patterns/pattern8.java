package patterns;

public class pattern8 {
    public static void main(String[] args) {
        // Pattern 8
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=2*i+1; j<10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
