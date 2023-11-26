package hij;
import java.util.Scanner;

public class ghi {
    
    public static void main(String[] args) {
        Scanner mvp = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int bilangan = mvp.nextInt();
        
        System.out.print("Masukkan Pangkat: ");
        int Pangkat = mvp.nextInt();
         
        int hasil = 1;
        
        for (int i = 0; i < Pangkat; i++) {
            hasil *= bilangan;
            
        }
        System.out.println(" Hasil: " + bilangan + " Pangkat " + Pangkat + " jadi " + hasil);
        
    }
    
}
