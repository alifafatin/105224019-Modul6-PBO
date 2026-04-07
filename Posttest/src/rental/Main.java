package rental;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Kendaraan> daftar = new ArrayList<>();
        // sikan 4 buah objek dengan
        // skenario berikut: (1) Mobil lama (di bawah 2015) berkapasitas > 5, (2) Mobil baru (>= 2015) berkapasitas
        // <= 5, (3) Motor ber-CC >= 250, dan (4) Motor standar ber-CC < 250. Terakhir, gunakan perulangan
        // (looping) untuk menelusuri setiap objek di dalam koleksi ArrayList, panggil fungsi displayInfo(), lalu
        // cetak "Total Biaya Sewa selama 5 Hari: " beserta hasil pemanggilan fungsi hitungHargaSewa(5).
        // Buktikan bahwa polimorfisme (ArrayList + Inheritance) dan perhitungan logika kondisional pada tiap
        // subclass berjalan dengan sangat presisi!

        daftar.add(new Mobil("B1234AA", "Toyota Avanza", 2010, 200000, 7));
        daftar.add(new Mobil("B5678BB", "Honda Brio", 2020, 250000, 5));
        daftar.add(new Motor("B9999CC", "Yamaha R25", 2021, 150000, 250));
        daftar.add(new Motor("B8888DD", "Honda Beat", 2018, 100000, 110));

        for (Kendaraan k : daftar) {
            k.displayInfo();
            System.out.println("Ttotal biaya sewa selama 5 hari: " + k.hitungHargaSewa(5));
            System.out.println("=======================================");
        }
    }
}