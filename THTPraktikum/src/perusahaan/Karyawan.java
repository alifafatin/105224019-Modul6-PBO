package perusahaan;
public class Karyawan {
    //buatlah sebuah atribut dengan modifier private sesuai dengan di modul

    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    //membuat konstruktor dengan validasi bahwa sakala rating kinerja adalah 1.0 hingga 5.0
    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        if (ratingKinerja >= 1.0 && ratingKinerja <= 5.0) {
            this.ratingKinerja = ratingKinerja;
        } else {
            this.ratingKinerja = 3.0; // set nilai default jika input yang dimasukkan tidak valid
        }
    }

    //membuat getter untuk semua atribut yang sudah dibuat
    public String getIdKaryawan() {
        return idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public int getTahunMasuk(){
        return tahunMasuk;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getRatingKinerja() {
        return ratingKinerja;
    }

    //membuat setter untuk semua atribut 
    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    //membuat setter untuk rating kinerja dengan validasi bahwa skala rating kinerja adalah 1.0 hingga 5.0
    public void setratingKinerja(double ratingKinerja){
        if (ratingKinerja >= 1.0 && ratingKinerja <= 5.0){
            this.ratingKinerja = ratingKinerja;
        } else {
            this.ratingKinerja = 3.0; // set nilai default jika input yang dimasukkan tidak valid
        }
    }

    //membuat fungsi hutungGajiTotal() dengan menambahkan nilai double dengan logika yang sudah diberiakn
    public double hitungGajiTotal(){
        //asumsi logika perhitungan parent 
        int masaKerja = 2026 - tahunMasuk;
        //bonus loyalitas dengan menambahkan 5% dari gaji pokok pada setiap tahun masa kerja 
        double bonusLoyalitas = gajiPokok * 0.05 * masaKerja; 
        //maka hitung total gaji yang sudah ditambahkan dengan bonus loyalitas
        double totalGaji = gajiPokok + bonusLoyalitas;

        //penalti kerja
        //jika rating kinerja dibawah 2.5 maka hasil penjumlahan akan dipotong 10%
        //kenapa dikali 0.9? karena 100% - 10% = 90% atau 0.9
        //yang artinya akan dipotong 10% dari total gaji yang sudah dihitung sebelumnya
        if (ratingKinerja < 2.5){
            totalGaji *= 0.9;
        }
        return totalGaji;
    }

    //fungsi displayInfo untuk menampilkan atau mencetak  ID, Nama, Tahun Masuk, Rating, dan Gaji Pokok
    public void displayInfo(){
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama:" + nama);
        System.out.println("Tahun Masuk:" + tahunMasuk);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Rating Kinerja:" + ratingKinerja);
    }
}
