package anda;

public class faktorial {
    
    public static void main(String[] args) {
        int angka = 5;
        int hasil = angka;
        System.out.println(angka+"! = ");
        for(int a = angka; a > 0; a--){
            System.out.print(a);
            if(a > 1){
                System.out.print(" x ");
            }
            if(angka != a){
                hasil *= a;
            }
        }
        System.out.println("");
        System.out.println("hasil = "+hasil);
    }
    
}
        
        
        
