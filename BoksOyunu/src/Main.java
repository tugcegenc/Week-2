public class Main {
    public static void main(String[] args) {
        // İki dövüşçü oluşturuluyor: Adı, hasarı, sağlığı, ağırlığı ve kaçma olasılığı belirtiliyor
        Fighter f1 = new Fighter("Ali", 10, 120, 100, 30);
        Fighter f2 = new Fighter("Ahmet", 20, 85, 85, 30);

        // Bir maç oluşturuluyor: İki dövüşçü, minimum ve maksimum ağırlık sınırları belirtiliyor
        Match match = new Match(f1, f2, 85, 100);

        // Maç başlatılıyor
        match.run();
    }
}
