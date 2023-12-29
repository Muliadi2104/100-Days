package skc;
import java.util.Scanner;

public class csc {
    
    public static void main(String[] args) {
                while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Angka : ");
            int nilai = sc.nextInt();
            if(nilai>= 40 && nilai <= 99){
                System.out.println("masuk dalam kategori");
                break;
            }else{
                System.out.println ("tidak masuk kategori");
                System.out.println(nilai);
                
            }
        }
    }

}
