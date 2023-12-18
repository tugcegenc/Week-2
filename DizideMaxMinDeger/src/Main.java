import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int num = input.nextInt();

        int[] list = {15, 12, 88, 1, -1, -78, 79, 2, 0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int min = list[0];
        int max = list[list.length - 1];

        for (int i : list) {
            if (i < num && i > min) {
                min = i;
            }
            if (i > num && i < max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer: " + list[0]);
        System.out.println("Maxımum Değer: " + list[list.length - 1]);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
