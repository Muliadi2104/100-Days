package mulya11;
import java.util.Scanner;

public class mulya11 {
    
    public static void main(String[] args) {
        Scanner war = new Scanner(System.in);
        System.out.print("menu makanan = ");
        int menu = war.nextInt();
        System.out.println("----------------");
        int porsi,total, harga = 0;
        switch(menu){
            case 1:
            System.out.println("menu= Nasi goreng");
            System.out.print("Berapa Porsi = ");
            porsi = war.nextInt();
            harga = 50000 * porsi;
            total = harga;
            System.out.print("total pembelian ="+harga);
            break;
            case 2:
            System.out.println("Menu = Bakso");
            System.out.print("berapa Porsi = ");
            porsi = war.nextInt();
            harga = 60000 * porsi;
            total = harga;
            System.out.print("total pembelian = "+harga);
            break;
            case 3:
            System.out.println("Menu = Sate ayam");
            System.out.println("berapa porsi= ");
            porsi = war.nextInt();
            harga = 70000 * porsi;
            total = harga;
            System.out.print("total pembelian = "+harga);
            break;
              default:
            System.out.println("game invalid");
        }
    }
}  
