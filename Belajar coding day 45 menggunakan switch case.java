package hayy;
import java.util.Scanner;
public class haloo {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai uang:");
        int angka = input.nextInt();
        
        switch(angka){
            case 100:
            System.out.println("konverensi nilai uang adalah Seratus ribu rupiah");
            break;
            case 200:
            System.out.println("konversi nilai uang adalah  Dua ratus ribu rupiah ");
            break;
            case 300:
            System.out.println("konverensi nilai uang adalah Tiga ratus ribu rupiah ");
            break;
            case 400:
            System.out.println("konverensi nilai uang adalah Empat ratus ribu rupiah ");
            break;
            case 500:
            System.out.println("konverensi nilai uang adalah Lima ratus ribu rupiah ");
            break;
            default:
            System.out.println("uang anda tidak ter konverensi ");
        }
    
    }
    
              }
