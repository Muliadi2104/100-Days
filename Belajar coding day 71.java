package anda;

public class faktorial {
    
    public static void main(String[] args) {
        int angka = 6;
        int hasil = angka;
        System.out.println(angka+"! = ");
        for(int AB = angka; AB > 0; AB--){
            System.out.print(AB);
            if(AB > 1){
                System.out.print(" x ");
            }
            if(angka != AB){
                hasil *= AB;
            }
        }
        System.out.println("");
        System.out.println("hasil = "+hasil);
    }
    
}
        
        
        
