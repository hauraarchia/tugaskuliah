import java.util.Scanner;
public class ArrayNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        // for (int i = 0; i < 10; i++){
        //     System.out.println("Masukkan Nilai akhir Mahasiswa ke-" + (i+1) + ": ");
        //     nilaiAkhir[i] = sc.nextInt();
        // }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Masukkan nilai akhir Mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
            
        }
        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i+1) + " lulus");    
            }else{
                System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus");
            }
            // System.out.println("Nilai akhir Mahasiswa ke-" + (i+1) + " adalah " + nilaiAkhir[i]);
        }
    }
}
