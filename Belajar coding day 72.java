package sallada;
import java.util.Scanner;
public class natann {
    
    public static void main(String[] args) {
        
        Scanner main= new Scanner(System.in);
        int awal,akhir;
        System.out.print("awal bilangan : ");
        awal = main.nextInt();
        System.out.print("akhir bilangan : ");
        akhir = main.nextInt();
        do{
           System.out.println(awal); 
          awal++;  
        }while(awal <= akhir);
            System.out.println();
        
    }
    
}
