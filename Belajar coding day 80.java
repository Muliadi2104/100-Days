package editor;
import java.util.Scanner;

public class files {
    
    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        System.out.print ("masukkan angka :");
        int angka = ip.nextInt();
        int hasil = angka;
        System.out.println(angka +" ! = ");
        
        for ( int A = angka; A > 0; A-- ){
            System.out.print(A);
            if ( A > 1){
                System.out.print(" x ");
                
            }
            if (angka != A){
                hasil *= A;
                
            }
        }
        
        
        System.out.println("");
        System.out.println (" hasil " + hasil);
    }
    
}
