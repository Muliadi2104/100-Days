import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        //membuat objek baru
        Scanner input = new Scanner(System.in);
        //mendeklarasikan variabel
        String nama;
        int nilai1, nilai2;
        double total;
        
        //mengimput
        System.out.print ("masukkan nama anda : ");
        nama = input.nextLine();
        System.out.print ("Masukkan Nilai 1 : ");
        nilai1 = input.nextInt();
        System.out.print ("Masukkan Nilai 2 : ");
        nilai2 = input.nextInt();
        
        //proses
        total = nilai1+nilai2;
        
        //output
        System.out.println ("Nama anda  : "+nama);
        System.out.println ("Nilai anda : "+total);
    }
    
                            }
