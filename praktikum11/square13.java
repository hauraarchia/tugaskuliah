import java.util.Scanner;
/**
 * square13
 */
public class square13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan jumlah *: ");
        int n = s.nextInt();

        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");       
            }
            System.out.println();
        }
    }
}