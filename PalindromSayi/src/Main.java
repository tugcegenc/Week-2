import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int temp = number;
        int reverseNumber = 0, lastNumber;

        // Sayının tersini bulma işlemi
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        // Palindrom kontrolü
        if (reverseNumber == number)
            System.out.println("Bu bir palindrom sayıdır.");
        else
            System.out.println("Bu bir palindrom sayı değildir.");
    }
}
