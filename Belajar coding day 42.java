import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang M: ");
        int M = input.nextInt();
        int a [] = new int[M];
        System.out.println();
        System.out.println("Input :");
        for(int i = 0; i < M; i++){
            System.out.print("Masukkan Data ke-"+(i+1)+" : ");
            a[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Output :");
        for(int i = 0; i < M; i++){
            System.out.print(a[i]+" ");
        }
        
    
   }
 }
