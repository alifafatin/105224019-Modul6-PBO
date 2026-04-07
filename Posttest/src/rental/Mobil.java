package rental;

public class Mobil extends Kendaraan {
    int kapasitasPenumpang;

    public Mobil(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasPenumpang) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("kapasitas penumpang: " + kapasitasPenumpang);
    }

    @Override
    public double hitungHargaSewa(int hari){
        double total = super.hitungHargaSewa(hari);
        total += 50000 * hari;// biaya asuransi

        if(kapasitasPenumpang > 5){
            total += 50000;
        }

        return total;
    }

    
}
