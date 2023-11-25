package efg;

public class def {
    
    public static void main(String[] args) {
        double total = 14000;
        System.out.println("Belanja = Rp. "+total);
        if (total >= 20000){
            System.out.println("Anda mendapatkan diskon = 15%");
            double diskon = 15 * total / 100;
            total -= diskon;
            
          } else if ( total >= 15000){
            System.out.println("Anda mendapatkan diskon = 10%");
            double diskon = 10 * total / 100;
            total -= diskon;
        
    }
    else{
        System.out.println ("Anda tidak mendapatkan diskon");
        
    }
        System.out.println ("Total pembayaran anda = Rp. "+ total);
    
    
    } 
}
