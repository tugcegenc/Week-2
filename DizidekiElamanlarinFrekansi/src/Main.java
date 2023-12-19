import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value, int currentIndex) {
        // Dizinin belirli bir indisine kadar arama yapar
        for (int i = 0; i < currentIndex; i++) {

            if (arr[i] == value) { // Değer zaten önceki indislerde bulunuyorsa false döndürür
                return false;
            }
        }
        return true; // Değer önceki indislerde bulunmuyorsa true döndürür
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi: " + Arrays.toString(list));

        System.out.println("----Tekrar eden sayılar----");

        // Dizi içindeki her bir elemanı kontrol eder
        for (int i = 0; i < list.length; i++) {
            int count = 0;

            // Her bir elemanın kaç kez tekrar ettiğini sayar
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }

            if (count > 0 && isFind(list, list[i], i)) {
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}
