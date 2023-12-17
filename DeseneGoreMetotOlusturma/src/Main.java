import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int userNumber = scanner.nextInt(); // Kullanıcıdan alınan ilk sayı

        // Kullanıcıdan alınan sayı pozitifse, recursive fonksiyon çağrılır
        if (userNumber > 0)
            recursiveFunction(userNumber, userNumber, -1); // Yönlendirme -1 olarak başlatılır
        else
            System.out.println("Lütfen pozitif sayı giriniz."); // Pozitif sayı girilmediğinde hata mesajı verilir
    }

    // Recursive fonksiyon
    static void recursiveFunction(int userNumber, int n, int direction) {
        System.out.print(n + " "); // Mevcut n değeri yazdırılır

        // Yön +1 ve n değeri başlangıç sayısına eşitse işlem durdurulur
        if (direction == 1 && n == userNumber) {
            return;
        }

        // Eğer n 0 veya negatifse, yön +1 olarak değiştirilir
        if (n <= 0) {
            direction = 1;
        }

        // Yöne göre n değeri artırılır veya azaltılır ve fonksiyon tekrar çağrılır
        recursiveFunction(userNumber, n + (5 * direction), direction);
    }
}
