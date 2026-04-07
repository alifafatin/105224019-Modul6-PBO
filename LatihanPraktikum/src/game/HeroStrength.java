package game;

public class HeroStrength extends Hero {
    String tipe = "Strength";

    public HeroStrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("tipe: " + tipe);
    }

    @Override
    public void terimaSerangan(double damage) {
        jumlahDarah -= damage * 0.5;
        System.out.println(nama + " menerima damage sebesar " + (damage * 0.5) + " (dikurangi 50%)");
    }
}