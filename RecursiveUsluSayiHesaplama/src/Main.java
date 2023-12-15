import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban ve üs değerlerini alma
        System.out.print("Taban değeri giriniz: ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();

        // Üs alma işlemini gerçekleştirme ve sonucu yazdırma
        double result = calculatePower(base, exponent);
        System.out.println("Sonuç: " + result);
    }

    // Recursive metot: Üs alma işlemini gerçekleştirir
    public static double calculatePower(double base, double exponent) {
        // Temel durum: Üs değeri 0 ise sonuç her zaman 1'dir
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            // Pozitif üs için tabanı üs kadar çarparak işlemi recursive olarak devam ettirme
            return base * calculatePower(base, exponent - 1);
        } else {
            // Negatif üs için 1 / (taban ^ (-üs)) formülünü kullanarak işlemi recursive olarak devam ettirme
            return 1 / (base * calculatePower(base, -exponent - 1));
        }
    }
}
