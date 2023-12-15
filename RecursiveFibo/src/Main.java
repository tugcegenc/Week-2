import java.util.Scanner;

public class Main {

    // Fibonacci serisini hesaplamak için kullanılan metot
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan Fibonacci serisi için eleman sayısını alma
        System.out.print("Fibonacci serisi için eleman sayısı giriniz: ");
        int n = input.nextInt();


        System.out.print("Fibonacci serisi: ");

        // Girilen sayıya kadar olan Fibonacci serisini ekrana yazdırma
        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();

        // Girilen sayıdaki Fibonacci elemanını ekrana yazdırma
        System.out.println(n + ". Fibonacci: " + fib(n));
    }
}
