package nes;
import java.util.Scanner;

public class ind {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan angka 1 :");
        int X = sc.nextInt();
        System.out.print("Masukkan angka 2 :");
        int Y = sc.nextInt();
        
        int Z = X * Y ;
        
        if( Z % 2 == 0){
            System.out.println(Z+2);
        }else{
            System.out.println (Z+1);
        }
    }
    
}
