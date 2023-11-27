package lkm;
import java.util.Scanner;
public class jlk {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int jumlah = 3;
        double  nilai, total = 0, rata;
        for(int i = 1; i <= jumlah; i++){
            System.out.print("nilai ke-"+i+" = ");
            nilai = sc.nextDouble();
            total += nilai;
        }
            rata = total / jumlah;
        System.out.println("total \t = "+total);
        System.out.println("rata \t = "+rata);
        
    }
    
}
        
    
