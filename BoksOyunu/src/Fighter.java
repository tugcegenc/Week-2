public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    // Fighter sınıfının kurucusu
    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        // Dodge değerini kontrol etme ve uygun aralıkta olup olmadığını kontrol etme
        if (dodge >= 0 && dodge <= 100)
            this.dodge = dodge;
        else
            this.dodge = 0;
    }

    // Rakibine saldıran metod
    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        // Eğer rakip saldırmaya başlarsa ek saldırı yapma
        if (foe.isFighterStart()) {
            System.out.println(this.name + " => " + foe.name + " " + this.damage + " ek saldırı yaptı.");
            return (int) (foe.health - (2) * this.damage);
        }

        // Rakibin saldırıyı bloke etme durumu
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı!");
            return foe.health;
        }

        // Sağlık kontrolü ve hasar uygulama
        if (foe.health - this.damage < 0)
            return 0;
        return foe.health - this.damage;
    }

    // Dodge olup olmadığını rastgele kontrol eden metod
    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    // Hangi dövüşçünün başlayacağını rastgele belirleyen metod
    boolean isFighterStart() {
        double randomNum = Math.random() * 100;
        return randomNum > 50;
    }
}
