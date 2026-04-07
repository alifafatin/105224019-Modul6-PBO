public class Main{
    public static void main(String[] args) {
        MakanRingan snack = new MakanRingan("Chips", 15000, "Keju");
        snack.tampilkanDetail();
        System.out.println("Rasa Makanan: " + snack.rasaMakanan);
    }
}