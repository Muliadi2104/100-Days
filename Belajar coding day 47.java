package cba;
import java.util.Scanner;

public class abc {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka = 40;
        System.out.println("Maksimal angka = "+angka);
        System.out.println();
        System.out.println("Batas angka genap = ");
        int batas = input.nextInt();
        System.out.println("Batas angka ganjil = ");
        int batasss = input.nextInt();
        System.out.println("Angka genap");
        for (int i = 2; i <= angka; i+=2){
            System.out.println(i);
            batas--;
            if (batas == 0) {
                break;
            }
        }    
        System.out.println ();
        System.out.println ("angka ganjil");
        for (int i = 1; i <= angka; i+=2) {
            System.out.println(i);
            batas--;
            if (batasss == 0 ){
                break;
                
            }
        }
            
    }
}
            
