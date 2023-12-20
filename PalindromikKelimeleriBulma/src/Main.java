import java.util.Scanner;

public class Main {
    static boolean isPalindrom(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return (str.equals(reverse));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String c = input.nextLine().toUpperCase();

        if (isPalindrom(c)) {
            System.out.println("Palindromik kelimedir.");
        } else {
            System.out.println("Palindromik kelime değildir.");
        }
    }
}
