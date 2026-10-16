
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = sc.nextInt();
        int element = sc.nextInt();

        // Shift elements to the right
        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert element
        arr[index] = element;

        // Print updated array
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
