package Karyawan;

public class InterfaceMain {
    public static void main(String[] args) {
        Developer dev = new Developer("Risma");
        Engineer eng = new Engineer("Putri");
        
        dev.bekerjaDiPerusahaan();
        dev.tglGaji();
        dev.totalGaji();
        System.out.println("---------------------------------------------");
        eng.bekerjaDiPerusahaan();
        eng.tglGaji();
        eng.totalGaji();
        eng.durasiJamKerja();
        eng.tambahanJamKerja();  
    }
}
