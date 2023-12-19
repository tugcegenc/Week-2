import java.util.Arrays;

public class Main {
    // Dizideki bir değeri aramak için yardımcı fonksiyon
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // İşlem yapılacak olan ana dizi
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 10, 10, 2, 2,};
        // Tekrar eden öğelerin tutulacağı dizi
        int[] duplicate = new int[list.length];
        // İkinci bir dizi üzerinde gezinmek için kullanılacak olan başlangıç indis değeri
        int startIndex = 0;

        // İki adet for döngüsüyle tekrar eden öğeler aranır
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                // Eğer aynı olmayan indekslerdeki elemanlar birbirine eşitse ve
                // bu değer daha önce duplicate dizisine eklenmediyse, duplicate dizisine eklenir
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println("Dizi: "+Arrays.toString(list) );
        System.out.println("-----------------------------------------------------------");

        // Tekrar eden sayıları ekrana yazdırma
        System.out.println("Tekrar eden sayılar");
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }

        // Tekrar eden çift sayıları ekrana yazdırma
        System.out.println("\nTekrar eden çift sayılar");
        for (int value : duplicate) {
            if (value != 0 && value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
    }
}
