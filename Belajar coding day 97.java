package mulya8;
import java.util.Scanner;
public class mulya8 {
    
    public static void main(String[] args) {
        while(true){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka :");
        
        int a = sc.nextInt();
        if(a>=1 && a<=9){
            System.out.println("satuan");
        }if(a>=10 && a<=99){
            System.out.println("puluhan");
        }if(a>=100 && a<=999){
            System.out.println("ratusan");
        }
    }
  }
}
    
