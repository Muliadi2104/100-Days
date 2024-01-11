package mulya7;
import java.util.Scanner;

public class Mulya7 {
    
    public static void main(String[] args) {
        int jumlah;
        Scanner sc = new Scanner(System.in);
        System.out.print("jumlah index :");
        jumlah = sc.nextInt();
        int a [] = new int [jumlah];
        System.out.print("input :");
        System.out.println("-----------");
        
        for ( int i = 0; i < jumlah; i++){
            System.out.print("index ke "+ i +" : ");
            a [i] = sc.nextInt();
            
        }
        System.out.println("--------------");
        System.out.println("output :");
        for(int i = 0; i < jumlah; i++){
            System.out.print (a[i]+" ");
        }
        
    }
    
}
