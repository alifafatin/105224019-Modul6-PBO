public class Produk {
   String namaProduk;
   double hargaProduk;

   //constructor
   public Produk(String namaProduk, double hargaProduk){
    this.namaProduk = namaProduk;
    this.hargaProduk = hargaProduk;
   }

   //tampilkan detail
   public void tampilkanDetail(){
    System.out.println("Nama Produk: " + namaProduk);
    System.out.println("Harga Produk: " + hargaProduk);
   }
}

class MakanRingan extends Produk{
    String rasaMakanan;

    public MakanRingan(String namaProduk, double hargaProduk, String rasaMakanan){
        super(namaProduk, hargaProduk);
        this.rasaMakanan = rasaMakanan;
    }
}



