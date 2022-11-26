package Karyawan;

public class Engineer extends Karyawan implements IGaji, IJamKerja{
    public Engineer(String nama){
        super(nama);
    }

    @Override
    public void tglGaji(){
        System.out.println("Saya gajian pada tanggal 1");
    }

    @Override
    public void totalGaji(){
        System.out.println("Gaji saya Rp 7.500.000");
    }

    @Override
    public void durasiJamKerja(){
        System.out.println("Saya bekerja selama 8 jam");
    }

    @Override
    public void tambahanJamKerja(){
        System.out.println("Dengan tambahan 2 jam lembur");
    }
}
