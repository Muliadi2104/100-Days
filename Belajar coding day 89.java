package natan2;
import java.util.Scanner;
public class natan2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Huruf (A - C): ");
        char huruf = input.next().charAt(0);

        switch (huruf) {
            case 'A':
                System.out.println("Anda memasukkan Huruf A.");
                break;
            case 'B':
                System.out.println("Anda memasukkan Huruf B.");
                break;
            case 'C':
                System.out.println("Anda memasukkan Huruf C.");
                break;
            default:
                System.out.println("Huruf yang Anda masukkan tidak valid.");
                break;
        }
    }
}
