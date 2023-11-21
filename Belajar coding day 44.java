package coding100;
import java.util.Scanner;
public class belajarcoding100 {
    
    public static void main(String[] args) {
        //membuat objek baru
        Scanner input = new Scanner(System.in);
        //mendeklarasikan variabel
        String nama;
        int nilai1, nilai2, nilai3, nilai4;
        double total;
        
        //mengimput
        System.out.print ("masukkan nama anda : ");
        nama = input.nextLine();
        System.out.print ("Masukkan Nilai Agama : ");
        nilai1 = input.nextInt();
        System.out.print ("Masukkan Nilai Matematika : ");
        nilai2 = input.nextInt();
        System.out.print ("Masukkan Nilai IPA : ");
        nilai3 = input.nextInt();
        System.out.print ("Masukkan Nilai Bahasa indonesia : ");
        nilai4 = input.nextInt();
        
        //proses
        total = (nilai1 + nilai2 + nilai3 + nilai4)/4;
        
        //output
        System.out.println ("\n==========================");
        System.out.println ("Nama anda  : "+nama);
        System.out.println ("Rata-rata Nilai : "+total);
        
        if (total >=70) {
         System.out.println ("SELAMAT ANDA LULUS");
         }
         else
         System.out.println ("MAAF ANDA TIDAK LULUS");
    }
    
          }
