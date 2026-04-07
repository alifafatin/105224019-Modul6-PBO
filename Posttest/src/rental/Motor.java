package rental;
public class Motor extends Kendaraan {
    int kapasitasMesin;

    public Motor(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasMesin) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("kapasitas mesin: " + kapasitasMesin + " cc");
    }

    @Override
    public double hitungHargaSewa(int hari){
        double total = super.hitungHargaSewa(hari);
        if(kapasitasMesin >= 250){
            total += 25000 * hari;
        }

        return total;
    }
}
