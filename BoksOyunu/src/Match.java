import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    // Maç sınıfının kurucusu
    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    // Maçı başlatan ve dövüşü yürüten metod
    int run() {
        if (isCheck()) { // Siklet kontrolü
            boolean firstFighterStarts = new Random().nextBoolean(); // Rastgele ilk boksörü seç

            // Hangi dövüşçünün ilk başlayacağını belirleme
            if (firstFighterStarts) {
                System.out.println(this.f1.name + " ilk dövüşe başlıyor!");
            } else {
                System.out.println(this.f2.name + " ilk dövüşe başlıyor!");
            }

            // Dövüşü yürütme
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("-----YENİ ROUND-----");

                if (firstFighterStarts) {
                    this.f2.health = this.f1.hit(this.f2); // İlk dövüşçü vuruyor
                    if (isWin()) // Kazanan kontrolü
                        break;

                    this.f1.health = this.f2.hit(this.f1); // İkinci dövüşçü vuruyor
                    if (isWin()) // Kazanan kontrolü
                        break;
                } else {
                    this.f1.health = this.f2.hit(this.f1); // İlk dövüşçü vuruyor
                    if (isWin()) // Kazanan kontrolü
                        break;

                    this.f2.health = this.f1.hit(this.f2); // İkinci dövüşçü vuruyor
                    if (isWin()) // Kazanan kontrolü
                        break;
                }

                System.out.println(this.f1.name + " Sağlık: " + this.f1.health + " , " + this.f2.name + " Sağlık: " + this.f2.health);
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor."); // Siklet uyumsuzluğu mesajı
        }
        return 0;
    }

    // Siklet uyumluluğunu kontrol eden metod
    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    // Kazananı kontrol eden metod
    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " kazandı.");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(f1.name + " kazandı.");
            return true;
        }
        return false;
    }
}
