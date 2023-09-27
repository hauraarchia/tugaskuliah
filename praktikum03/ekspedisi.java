import java.util.Scanner;

public class ekspedisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaKirim;
        float jumlahPembayaran, beratBarang;
        String kotaTujuan;


        //bandung=12000/kg
        //pasuruan=10000/kg
        System.out.println("masukkan kota tujuan(pasuruan=10000/kg,bandung=12000/kg): ");
        kotaTujuan = sc.nextLine();
        System.out.println("masukkan harga kirim : ");
        hargaKirim = sc.nextInt();
        System.out.println("masukkan berat barang :");
        beratBarang = sc.nextInt();

        jumlahPembayaran = hargaKirim * beratBarang;
        System.out.println("jumlah pembayaran yang harus dibayar = " + jumlahPembayaran);





        

        
    }
}
