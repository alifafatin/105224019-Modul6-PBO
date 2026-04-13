package perusahaan;

public class Developer extends Karyawan {
    private String level; //nanti level akan diisi dengan junior, mid, dan senor
    private int jumlahBugFix;

    //membuat konstruktor dengan kelas developer yang mewarisi kelas dari karyawan 
    //jadi nanti ada idKaryawan dan sebagainya
    public Developer (String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String level, int jumlahBugFix) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.level = level;
        this.jumlahBugFix = jumlahBugFix;
    }

    //membuat getter untuk level dan jumlah bug fix
    public String getLevel() {
        return level;
    }

    public int getJumlahBugFix() {
        return jumlahBugFix;
    }

    //override berfungsi untuk menggabungkan atau penimpaan method punya superclass karyawan dengan method yang ada di subclass developer
    @Override 
    public double hitungGajiTotal(){
        //mengambil hasil gaji dari superclass karyawan
        double gajiTotal = super.hitungGajiTotal();

        //tunjangan sesuai dengan level yang sudah ditentukan pada soal THT
        if (level.equalsIgnoreCase("Senior")) {
            gajiTotal += 3000000; //senior mendapatkan tunjangan sebesar Rp3.000.000
        } else if (level.equalsIgnoreCase("Mid")) {
            gajiTotal += 1500000; //sedangkan mid mendapatkan tunjangan sebesar Rp1.500.000
        } else if (level.equalsIgnoreCase("Junior")) {
            gajiTotal += 0; //harusnya junior tidak mendapatkan tunjangan si makanya ditambah 0
        }

        //bonus untuk setiap bug fix, dimana 50.000 per jumlah bug fix yang sudah diperbaiki
        //bonus hanya diberikan jika ratingKinerja Developer lebih dari 3.0 , jika dibawah itu maka hangus 

        if (getRatingKinerja() >= 3.0){
            gajiTotal += jumlahBugFix * 50000; //bonus untuk setiap bug fix yang sudah diperbaiki
        } else {
            gajiTotal += 0; //jika rating kinerja dibawah 3.0 maka bonus hangus
        }
        return gajiTotal;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); //memanggil method displayInfo dari kelas karyawan untuk menampilkan informasi dasar karyawan
        System.out.println("Level:" + level);
        System.out.println("Jumlah Bug Fix:" + jumlahBugFix);
    }
}
