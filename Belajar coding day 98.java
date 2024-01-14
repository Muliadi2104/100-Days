package mulya9;
import java.util.Scanner;
public class mulya9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int awal,akhir;
        System.out.print("masukkan awal  :");
         awal = sc.nextInt();
        System.out.print("masukkan akhir :");
         akhir = sc.nextInt();
        if(akhir < awal){
            System.out.print("inputan salah");
            
        } else{
            int b = awal;
            while( b <= akhir){
            System.out.print(b + " ");
            b++;
        }
        
    } 
    
    } 

}
