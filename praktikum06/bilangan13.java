import java.util.Scanner;
public class bilangan13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, bil3, bilTerbesar;
        System.out.println("masukkan bilangan pertama : ");
        bil1 = sc.nextInt();
        System.out.println("masukkan bilangan kedua : ");
        bil2 = sc.nextInt();
        System.out.println("masukkan bilangan ketiga : ");
        bil3 = sc.nextInt();

        if (bil1 >= bil2 && bil1 >= bil3){
            System.out.println(bilTerbesar = bil1);
        }else if (bil2 >= bil1 && bil2 >= bil3){
            System.out.println(bilTerbesar = bil2);
        }
        else{
            System.out.println(bilTerbesar = bil3);
        }
        System.out.println("Bilangan terbesar adalah : " + bilTerbesar);
    }
}
