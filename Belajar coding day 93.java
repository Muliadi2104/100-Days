package mulya5;
import java.util.Scanner;

public class mulya5 {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        int  awal ,akhir;
        System.out.print("Awal  :");
        awal = masuk.nextInt();
        System.out.print("Akhir :");
        akhir = masuk.nextInt();
        int x = awal;
        do{
            System.out.print(x +" ");
            x++;
        }while (x <= akhir);
        System.out.println("");
            
    }
    
}
