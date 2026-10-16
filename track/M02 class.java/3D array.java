
import java.util.Scanner;

public class ThreeDArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][][] = new int[3][3][5];
        System.out.println("Enter Array Element :");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 4; k++) {
                    a[i][j][k] = scan.nextInt();
                }
            }
            System.out.println();

        }
    }
}
    

}
