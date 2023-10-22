import java.util.Scanner;


 class Dcoder
 {
   public static void main(String args[])
   { 
   int nilai;
   String nama;
   Scanner adi =new Scanner(System.in);
   
    System.out.print("nama :");
    nama = adi.nextLine();
    System.out.print("nilai :");
    nilai = adi.nextInt();
    
    if(nilai >= 75){
     System.out.println("selamat "+nama+ " anda dinyatakan lulus" );
    }
     else{
      System.out.println("maaf"+nama+ " anda dinyatakan tidak lulus");
    }
   
   }
 }
