import java.util.Scanner;
/**
 * PemilihanBilangan
 */
public class PemilihanBilangan13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sebuah Angka: ");;
        int angka = sc.nextInt();
//ternary operator haura13
        String hasil;
        hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);
    //     if (angka % 2 == 0)
    // {
    //     System.out.println("Angka " + angka + " termasuk bilangan genap");
    // }
    // else{
    //     System.out.println("Angka " + angka + " termasuk bilangan ganjil");;
    // }
    }
}