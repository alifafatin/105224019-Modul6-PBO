package game;
public class Hero {
   String nama;
   double jumlahDarah;
   double attackPower;

   //konstructor
   public Hero(String nama, double jumlahDarah, double attackPower){
    this.nama = nama;
    this.jumlahDarah = jumlahDarah;
    this.attackPower = attackPower;
   }

   //menambahkan fungsi display(), berlatih(), dan terimaSerangan(double damage)
   public void display(){
      System.out.println("Nama Hero: " + nama);
      System.out.println("Jumlah Darah: " + jumlahDarah);
      System.out.println("Attack Power: " + attackPower);
   }

   public void berlatih(){
      attackPower += 10;
      System.out.println(nama + "sedang belatih, dengan attackpower: " + attackPower);
   }

   public void terimaSerangan(double damage){
      jumlahDarah -= damage;
      System.out.println(nama + " menerima serangan sebesar " + damage + ", maka sekarang health berkurang menjadi: " + jumlahDarah);

   }

   

}