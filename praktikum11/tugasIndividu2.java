import java.util.Scanner;
public class tugasIndividu2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
        int n = s.nextInt();

        //String[][] persegi = new String[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i!=1 && i!=n && j!=1 && j!=n) {
                    System.out.print("  ");
                }else{
                    System.out.print(n + " ");
                }
                
            }
            System.out.println();
            
        }
    }
}


