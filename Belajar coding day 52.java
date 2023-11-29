package mno;
import java.util.Scanner;

public class kmn {
    
    public static void main(String[] args) {
        
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Angka : ");
            int nilai = sc.nextInt();
            if(nilai>= 40 && nilai <= 99){
                System.out.println("Output:");
                System.out.println(nilai);
                break;
            }
        }
    }

    }
    
