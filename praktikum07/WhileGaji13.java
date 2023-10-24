import java.util.Scanner;

/**
 * WhileGaji13
 */
public class WhileGaji13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan: ");
        jumlahKaryawan = sc.nextInt(); 

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = sc.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = sc.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } 
            else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
            }else if(jabatan.equalsIgnoreCase("pegawai")){
                System.out.println("Jabatan Invalid");
            }
            totalGajiLembur += gajiLembur;
            }
            System.out.println( "Total gaji lembur: " + totalGajiLembur);
        }
    }
