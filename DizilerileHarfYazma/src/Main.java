public class Main {
    public static void main(String[] args) {

        // 7 satır, 4 sütunluk bir 2 boyutlu dizi oluşturuldu
        String[][] letter = new String[7][4];

        // Dizi elemanlarını oluşturmak için iki iç içe döngü kullanıldı
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {

                // 'B' harfine benzeyen deseni oluşturmak için koşullar belirlendi
                if ((i == 0 || i == 3 || i == 6)) {
                    letter[i][j] = " *"; // Desenin üst, orta ve alt kısımlarını oluşturacak yıldız (*) karakterleri eklendi
                } else if ((j == 0 || j == 3)) {
                    letter[i][j] = " *"; // Desenin sol ve sağ kenarlarını oluşturacak yıldız (*) karakterleri eklendi
                } else {
                    letter[i][j] = "  "; // Boşluklar, desen içindeki boş kısımları temsil ediyor
                }

                // Oluşturulan deseni ekrana yazdırmak için dizi elemanları yazdırıldı
                System.out.print(letter[i][j]);
            }
            // Her satırın sonunda bir alt satıra geçmek için bir satır atlatıldı
            System.out.println();
        }

    }
}
