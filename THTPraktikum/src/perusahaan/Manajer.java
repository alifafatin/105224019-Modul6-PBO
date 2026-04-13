package perusahaan;

public class Manajer  extends Karyawan {
    //menambahkan atribut divisi dan jumlah anggota untuk manajer
    private String divisi;
    private int jumlahAnggotaTim;

    //konstruktor dengan menggunakan super
    public Manajer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String divisi, int jumlahAnggotaTim) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    //membuat getter untuk divisi dan jumlah anggota tim

    public String getDivisi() {
        return divisi;
    }

    public int getJumlahAnggotaTim() {
        return jumlahAnggotaTim;
    }

    @Override
    public double hitungGajiTotal(){
        double totalGaji = super.hitungGajiTotal();
        
        totalGaji += jumlahAnggotaTim * 300000;//menambahkan 300.000 untuk setiap satu jumlah anggota tim yang dipimpinnya

        //bnonus kinerja ekstra
        if(getRatingKinerja() > 4.5){
            totalGaji *= 1.15;
        }
        return totalGaji;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); //memanggil method displayInfo dari kelas karyawan untuk menampilkan informasi dasar karyawan
        System.out.println("Divisi:" + divisi);
        System.out.println("Anggota Tim:" + jumlahAnggotaTim);
    }

}
