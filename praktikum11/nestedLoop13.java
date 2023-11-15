import java.util.Scanner;
public class nestedLoop13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah kota: ");
        int jkota = s.nextInt();

        double[][] suhu = new double[jkota][4];

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i + 1));

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print("Suhu ke-" + (j + 1) + ": ");
                suhu[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < suhu.length; i++) {
            System.out.print(("KOTA KE-") + (i + 1) + ": ");
            double sum = 0.0;

            for (double ds : suhu[i]) {
                System.out.print(+ds + ", ");
                sum += ds;
            }
            sum /= suhu[i].length;
            System.out.println("rata-rata: " + sum);
        }
    }
}
