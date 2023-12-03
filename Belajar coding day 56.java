package uvw;

public class tuv {
    
    public static void main(String[] args) {
        
        int[] array = {5, 3, 8, 2, 7};

        int nilai = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] < nilai) {
                nilai = array[i];
            }
        }

        System.out.println("Nilai terkecil dalam array adalah: " + nilai);
    }

    }
    
