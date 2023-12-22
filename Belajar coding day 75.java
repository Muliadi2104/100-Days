package wbb;
import java.util.Scanner;

public class ass {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("masukkan batas : ");
        int batas = input.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= batas; i++){
            jumlah += i;
            if (i > 1){
                System.out.print("+");
                
            }  
            System.out.print(i);
            
        }
        System.out.println (" = "+ jumlah);
        
    }
    
}
    

    
