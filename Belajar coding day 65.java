package uvw;

public class tuv {
    
    public static void main(String[] args) {
        
        int[] array = {20, 22, 24, 16, 12};

        int nilai = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] > nilai) {
                nilai = array[i];
            }
        }

        System.out.println("Nilai terbesar dalam array adalah: " + nilai);
    }

    }
    
