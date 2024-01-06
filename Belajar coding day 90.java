package pk;

public class eq {
    
    public static void main(String[] args) {
        
        String Mulya1 = "Bahagia";
        String Mulya2 = "Bahagia";
        
        if (Mulya1.equalsIgnoreCase(Mulya2)) {
            System.out.println("Kedua string sama (ignoring case).");
        } else {
            System.out.println("Kedua string berbeda.");
        }
    }
}
