package mulya2;
import java.util.Scanner;

public class mulya2 {
    
    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        System.out.print ("Masukkan angka :");
        int rows = ip.nextInt();

        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= rows; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
