import java.util.Scanner;
public class ArrayNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int max, min;
        int jumlahLulus=0;
        int jumlahTidakLulus=0;

        int[] nilaiAkhir = new int[10];

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
            total += nilaiAkhir[i];
        }
        max = nilaiAkhir[0];
        min = nilaiAkhir[0];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > max) {
                max = nilaiAkhir[i];    
        }
        if (nilaiAkhir[i] < min) {
                min = nilaiAkhir[i];    
        }
        if (nilaiAkhir[i] >= 70) {
            jumlahLulus++;
        } else{
            jumlahTidakLulus++;
        }

    }
        double average = total / nilaiAkhir.length;
        System.out.println("Rata-rata: " + average);
        System.out.println("Nilai tertinggi: " +max);
        System.out.println("Nilai Terendah: " +min);
        System.out.println("Jumlah mahasiswa lulus: " +jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " +jumlahTidakLulus);

}
}

