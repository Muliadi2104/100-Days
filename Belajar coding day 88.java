package rahasia;
import java.util.Scanner;

public class code {
    
    public static void main(String[] args) {
        int AngkaRahasia = 17;
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Angka rahasia : ");
            int kode = input.nextInt();
            if(kode == AngkaRahasia){
                System.out.println(" Angka Benar");
                break;
            }else if(kode > AngkaRahasia){
                System.out.println("Angka yang anda masukkan terlalu besar\n");
            }else if(kode < AngkaRahasia){
                System.out.println("Angka yang anda masukkan terlalu kecil\n");
            }
        }
    }
    
}
