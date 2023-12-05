package apa;
import java.util.Scanner;
public class ada {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tujuan = null;
        int pilihan;
        System.out.println("      Tujuan Travel    ");
        System.out.println("1. polman\n2. pinrang\n3. maros");
        System.out.print(" Tujuan yg Dipilih : ");
        pilihan = input.nextInt();
        if(pilihan ==1){
            tujuan = "polman";
        }else if(pilihan== 2){
            tujuan = "pinrang";
        }else if(pilihan == 3){
            tujuan = "maros";
        }else{
            tujuan = "tujuan tidak tersedia";
        }
        System.out.println("_______________________");
        System.out.println(tujuan);
        
    }
    
    
    

    }
    
