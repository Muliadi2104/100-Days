package mulya6;
import java.util.Scanner;

public class mulya6 {
    
    public static void main(String[] args) {
        String nama,alamat,pilih;
        do{
            Scanner sc = new Scanner (System.in);
            System.out.print("nama   :");
            nama = sc.nextLine();
            System.out.print("alamat :");
            alamat = sc.nextLine();
            System.out.println (nama+" tinggal di " + alamat);
            System.out.print("pilih (Y / Z ): ");
            pilih = sc.next();
            System.out.println("-----------------------");
        }while (pilih.equalsIgnoreCase("Y"));
            System.out.println("program selesai");
        
        
            
    }
    
}
