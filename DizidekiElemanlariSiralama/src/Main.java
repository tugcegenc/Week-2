import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan dizinin boyutunu alır
        System.out.print("Dizinin boyutu n: ");
        int n = input.nextInt();
        int[] list = new int[n];
        int value;

        // Kullanıcıdan dizinin elemanlarını alır
        System.out.println("Dizinin elemanlarını giriniz.");
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            value = input.nextInt();
            list[i] = value;
        }

        // Girilen dizinin orijinal hali ekrana yazdırılır
        System.out.println("---Dizi elemanları---");
        System.out.println(Arrays.toString(list));

        // Diziyi sıralayıp sıralı hali ekrana yazdırılır
        System.out.println("-----Sıralama-----");
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}