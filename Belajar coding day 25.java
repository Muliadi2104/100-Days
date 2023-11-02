//Agar kita bisa menggunakan Scanner, kita perlu mengimpornya.
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        /*
        Membuat Input data diri dengan menggunakan
        gabungan input Scanner dan perulangan do-while.
        */
        
        String lanjut, nama, alamat, prodi;
        char kelas;
        do{
            //Membuat Scanner
            Scanner mulmul = new Scanner(System.in);
            System.out.println("Masukkan Data Diri Teman Anda");
            System.out.println("");
            
            //Deklarasi Scanner
            System.out.print("Nama : ");
            //Cara memanggil Scanner
            nama = mulmul.nextLine();
            
            System.out.print("Asal : ");
            alamat = mulmul.nextLine();
            
            System.out.print("Prodi : ");
            prodi = mulmul.nextLine();
            
            System.out.print("Kelas : ");
            kelas = mulmul.next().charAt(0);
            
            //Menampilkan hasil output dari scanner
            System.out.println("_____________________");
            System.out.println("");
            System.out.println("Nama teman saya "+nama);
            System.out.println("Dia berasal dari "+alamat);
            System.out.println("Prodinya "+prodi+" kelas "+kelas);
            System.out.println("");
            
            //Menggunakan peeulangan do-while agar pengisian data terus berlanjut.
            System.out.print("Lanjut (yes/no) ? : ");
            lanjut = mulmul.next();
            System.out.println("");
        }while(lanjut.equalsIgnoreCase("yes"));
            System.out.println("TERIMAKASIH");
    }
}
