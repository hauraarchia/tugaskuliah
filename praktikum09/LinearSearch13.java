import java.util.Scanner;
public class LinearSearch13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key, x;
        int[] arrayInt;
        // int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        // int key = 20;
        int hasil = 0; 
        boolean found = false;

        System.out.print("Masukkan Jumlah elemen array: ");
        x = sc.nextInt();
        arrayInt = new int[x];  

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+ (i+1) + ": ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key){
                found = true;
                hasil = i;    
                System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);    
                }
            }
            if (found == false ) {
            System.out.println("key tidak ditemukan");
        }
       
    }
}
