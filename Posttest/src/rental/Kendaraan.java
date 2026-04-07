package rental;

public class Kendaraan {
    String nomorPolisi;
    String merk;
    int tahunProduksi;
    double hargaSewaDasar;

    public Kendaraan(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaDasar = hargaSewaDasar;
    }

    public void displayInfo(){
        System.out.println("nomor Polisi: " + nomorPolisi);
        System.out.println("merek: " + merk);
        System.out.println("tahun produksi: " + tahunProduksi);
        System.out.println("harga sewa dasar: " + hargaSewaDasar);
    }

    public double hitungHargaSewa(int hari){
        double total = hargaSewaDasar * hari;

        if(tahunProduksi < 2015){
            total *= 0.9; // diskon 10% untuk kendaraan lama
        }
        return total;
    }
}
