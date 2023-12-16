import java.util.Scanner;

public class Main {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 ve daha küçük sayılar asal değil
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Asal olmayan bir bölen bulundu
            }
        }
        return true; // Asal sayı
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " sayısı asaldır.");
        } else {
            System.out.println(number + " sayısı asal değildir.");
        }
    }
}
