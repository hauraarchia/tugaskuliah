import java.util.Scanner;
public class Segitiga {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int sudut1, sudut2, sudut3, totalSudut;
     System.out.println("masukkan sudut pertama: ");
     sudut1 = sc.nextInt();
     System.out.println("masukkan sudut kedua: ");
     sudut2 = sc.nextInt();
     System.out.println("masukkan sudut ketiga: ");
     sudut3 = sc.nextInt();

     totalSudut = sudut1 + sudut2 + sudut3;
     if (totalSudut == 180) {
        if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
        }else if((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)){
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
        }else if((sudut1==sudut2) || (sudut2 == sudut3) ||(sudut1 == sudut3 )){
            System.out.println("segitiga tersebut adalah segitiga sama kaki");
        }else{
            System.out.println("Segitiga tersebut adalah segitiga sembarang ");
        }
    }else{
        System.out.println("Bukan Segitiga");
        }
    }    
}