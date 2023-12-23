package pppp;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner mvp = new Scanner (System.in);
        
        System.out.print (" masukkan angka : ");
        int angka = mvp.nextInt();
        
        if ( angka >= 50){
            System.out.println("anda lulus");
            
        }else{
            System.out.println("anda tidak lulus");
        }
    }
    
}
