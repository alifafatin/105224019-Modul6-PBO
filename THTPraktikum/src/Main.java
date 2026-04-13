import perusahaan.Karyawan;
import perusahaan.Developer;
import perusahaan.Manajer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();   

        //membuat Objek 1: Karyawan biasa, masuk tahun 2020, rating 2.0 (Harus terkena penalti).
        daftarKaryawan.add(new Karyawan("K001", "cahya", 2020, 5000000, 2.0));

        //membuat Objek 2: Developer "Senior", masuk 2018, rating 4.0, menyelesaikan 20 bug (Bonus maksimal).
        daftarKaryawan.add(new Developer("D001", "monica", 2018, 7000000, 4.0, "Senior", 20));

        //membuat Objek 3: Developer "Mid", masuk 2024, rating 2.8, menyelesaikan 15 bug (Bonus bug hangus karena rating < 3.0)
        daftarKaryawan.add(new Developer("D002", "eca", 2024, 6000000, 2.8, "Mid", 15));

        //membuat Objek 4: Manajer divisi "IT", masuk 2015, rating 4.8, memimpin 10 anggota tim(Mendapat bonus kinerja ekstra 15%).
        daftarKaryawan.add(new Manajer("M001", "dodi", 2015, 10000000, 4.8, "IT", 10));

        //membuat Objek 5: Manajer divisi "HR", masuk 2025, rating 3.5, memimpin 3 anggota tim (Tunjangan manajerial biasa).
        daftarKaryawan.add(new Manajer("M002", "intan", 2025, 9000000, 3.5, "HR", 3));

        //var untuk menyimpann total anggaran gaji, gaji tertinggi, nama karyawan dengan gaji tertinggi, dan total rating untuk menghitung rata-rata nanti
        double totalAnggaran = 0;
        double gajiTertinggi = -1;
        String namaKaryawanTGajiTertinggi = "";
        double totalRating = 0;

         System.out.println("============================================================");
         System.out.println("==============Laporan Perusahaan Ea Eay=====================");
         System.out.println("============================================================");

         //perulangan untuk menampilkan informasi karyawan dan menghitung gaji total dan sebagainya
        for (Karyawan k : daftarKaryawan){
            k.displayInfo(); //memanggil method displayinfo dari objek k 
            //menghitung gaji total dengan memanggil method k lalu disimpan ke variabel gaji
            double gaji = k.hitungGajiTotal();
            System.out.println("Gaji Total: Rp" + gaji);
            System.out.println("============================================================");

            //hitung total anggaran karyawan
            totalAnggaran += gaji;
            //hitung total rating kinerja untuk menghitung rata-rata nanti
            totalRating += k.getRatingKinerja();

            //jika gaji total lebih besar dari gaji tertinggi yang sudah disimpan
            if (gaji > gajiTertinggi){
                //maka gaji akan di update dan nama karyawan denagn gaji tertinggi juga akan di update
                gajiTertinggi = gaji;
                namaKaryawanTGajiTertinggi = k.getNama();
            }
        }

        //menghitung rata rata rating kinerja dengan membagi totsal rating dengan jumlah karyawan yang ada di daftar karyawan
        double rataRataRating = totalRating / daftarKaryawan.size();

        //tampilan laporan akhir 
        System.out.println("============================================================");
        System.out.println("Total Anggaran Gaji: Rp" + totalAnggaran);
        System.out.println("Highest Earner: " + namaKaryawanTGajiTertinggi);
        System.out.println("rata-rata rating kinerja: " + rataRataRating);
        System.out.println("============================================================");


    }
}
