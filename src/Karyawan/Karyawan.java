package Karyawan;

public class Karyawan {
    protected String nama;
    public Karyawan(String nama){
        this.nama = nama;
    }

    public void bekerjaDiPerusahaan(){
        System.out.println("Nama saya " + this.nama);
        System.out.println("Saya bekerja di perusahaan.");
    }
}