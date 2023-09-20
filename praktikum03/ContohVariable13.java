package praktikum03;

public class ContohVariable13 {
    public static void main(String[] args){
        String SalahSatuHobiSayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 20;
        double $ipk = 3.24, tinggi = 1.78;

        System.out.println(SalahSatuHobiSayaAdalah);
        System.out.println("apakah pandai?" + isPandai);
        System.out.println("Jenis Kelamin:" + jenisKelamin);
        System.out.println("IPK:" + $ipk);
        System.out.println(String.format("Saya berumur %s dengan tinggi badan %s", _umurSayaSekarang, tinggi));
    }
}

