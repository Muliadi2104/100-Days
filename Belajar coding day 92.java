package mulya4;
import java.util.Scanner;
public class Mulya4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print(" input 1 / 2: ");
        
        int pil = sc.nextInt();
        switch (pil){
            case 1:
                System.out.println ("saya suka bermain voli");
                break;
            case 2:
                System.out.println("saya tidak suka bermain voli");
                break;
            default:
                System.out.println("pil salah");
                break;
                
                
        }
    }
    
}
