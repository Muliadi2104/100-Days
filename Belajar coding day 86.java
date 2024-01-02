package oop;
import java.util.Scanner;
public class ip {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Batas : ");
        int batas = in.nextInt();
        int batass = batas;
    
        
        System.out.println("\nAngka Genap");
        for(int i = 0; i <= 20; i+=2){
            System.out.println(i);
            batas--;
            if(batas == 0){
                break;
            }
        }
        System.out.println("\nAngka Ganjil");
        for(int i = 1; i <= 20; i+=2){
            System.out.println(i);
            batass--;
            if(batass == 0){
                break;
            }
        }
    }
}
