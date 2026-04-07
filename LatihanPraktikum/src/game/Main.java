package game;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("monic", 100, 50);
        HeroStrength hero2 = new HeroStrength("Haruka", 100, 40);

        System.out.println("Awal");
        hero1.display();
        System.out.println();
        hero2.display();

        System.out.println("berlatihh");
        hero1.berlatih();
        hero2.berlatih();

        System.out.println("kena damage 50");
        hero1.terimaSerangan(50);
        hero2.terimaSerangan(50);

        System.out.println("display akhir");
        hero1.display();
        System.out.println();
        hero2.display();
    }
}
