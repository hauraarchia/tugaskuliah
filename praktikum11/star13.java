import java.util.Scanner;

/**
 * star13
 */
public class star13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jumlah *: ");
        int n = s.nextInt();

        for (int i = 0; i <= n; i--) {
            System.out.print("*");
        }
    }
}