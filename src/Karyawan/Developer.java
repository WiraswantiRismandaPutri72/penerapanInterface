package Karyawan;

public class Developer extends Karyawan implements IGaji{
    public Developer(String nama){
        super(nama);
    }

    @Override
    public void tglGaji(){
        System.out.println("Saya gajian pada tanggal 1");
    }

    @Override
    public void totalGaji(){
        System.out.println("Gaji saya Rp 10.000.000");
    }
}