package cdb;

public class acd {
    
    public static void main(String[] args) {
        
        int hariKerja = 25;
        int gajiPerhari = 150000;
        int uangMakan = 15000;
        
        int TotalGajiKotor = gajiPerhari * hariKerja;
        int TotalMakan = uangMakan * hariKerja;
        
        int gajiBersih = TotalGajiKotor - TotalMakan;
        System.out.println("Gaji Bersih Karyawan Adalah Rp."+gajiBersih);
    }
    
}
