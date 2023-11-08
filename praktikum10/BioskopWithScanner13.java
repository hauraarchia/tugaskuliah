import java.util.Scanner;
public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan Nama: ");
            nama = s.nextLine();
            System.out.print("Masukkan Baris: ");
            baris = s.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom = s.nextInt();
            s.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = s.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
            
        }
    }
}
