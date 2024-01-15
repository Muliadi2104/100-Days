package mulya10;
import java.util.Scanner;
public class mulya10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Panjang,lebar,Luas,Keliling;
        
        System.out.print("Masukkan Panjang = ");
        Panjang = sc.nextInt();
        System.out.print("Masukkan luas = ");
        lebar = sc.nextInt();
        
        Luas = Panjang * lebar;
        Keliling = 2 * (Panjang + lebar);
        
        System.out.println("L = P x l");
        System.out.println ("L = " + Panjang + " x " + lebar);
        System.out.print("L = ");
        System.out.println(Luas + "\n");
        
        System.out.println("K = 2 x (P + l)");
        System.out.println ("K = 2 x ("+ Panjang + " + " + lebar + ")");
        System.out.print("K = ");
        System.out.println(Keliling + "\n");
        
        
    }
    
}
