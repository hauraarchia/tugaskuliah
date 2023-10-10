import java.util.Scanner;

/**
 * ekspedisi
 */
public class ekspedisi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double beratBarang ;
        String kotaTujuan;

        System.out.println("masukkan kota yang akan dituju(pasuruan, bandung, surabaya): ");
        kotaTujuan = sc.nextLine();
        System.out.println("masukkan berat barang(perkilo) :");
        beratBarang = sc.nextDouble();
        switch(kotaTujuan){
            case "pasuruan":
            System.out.println("Kota tujuan adalah Kota Pasuruan");
            System.out.println("Harga perkilo untuk tujuan pasuruan senilai 10000");
            System.out.println("berat barang =" +beratBarang);
            System.out.println("total harga pengiriman anda="  +beratBarang*10000 );
            break;
            case "surabaya":
            System.out.println("Kota tujuan adalah Kota Surabaya");
            System.out.println("Harga perkilo untuk tujuan pasuruan senilai 15000");
            System.out.println("berat barang =" +beratBarang);
            System.out.println("total harga pengiriman anda ="  +beratBarang*15000 );
            break;
            case "bandung":
            System.out.println("Kota tujuan adalah Kota Bandung");
            System.out.println("Harga perkilo untuk tujuan pasuruan senilai 25000");
            System.out.println("berat barang =" +beratBarang);
            System.out.println("total harga pengiriman anda ="  +beratBarang*25000 );
            break;
            default:
            System.out.println("maaf tujuan yang anda inginkan belum terdaftar");
            break;
        }
        
        // jumlahPembayaran = hargaKirim * beratBarang;

        // System.out.println("jumlah uang yang harus dibayar senilai: " + jumlahPembayaran);
        

        // if (kotaTujuan == 'pasuruan') {
        //     System.out.println(hargaKirim = 10000  );
        // } else if(kotaTujuan == "bandung" ) {
        //     System.out.println(hargaKirim = 25000);        
        // }
        // else if (kotaTujuan == "surabaya" ){
        //     System.out.println(hargaKirim = 15000);
        // }
        // else{
        //     System.out.println("kota yang anda inginkan belum terdaftar");
        // }
        
        
    }
}