import java.util.Scanner;
public class triangle13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah *: ");
        int n = s.nextInt();
        
        int i = 0;
        while (i <= n) {
            int j = 0;
            
            while (j < i) {
                System.out.print("*");
                j++;
            }
            
            i++;
            System.out.println();
            
        }
    }
}
