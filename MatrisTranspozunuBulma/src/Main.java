import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int row;
        int col;

        // Kullanıcıdan satır ve sütun sayıları isteniyor
        System.out.print("Satır sayısı giriniz: ");
        row = input.nextInt();
        System.out.print("Sütun sayısı giriniz: ");
        col = input.nextInt();

        // Kullanıcının girdiği satır ve sütun sayılarına göre matris oluşturuluyor
        int[][] matris = new int[row][col];
        System.out.println("Matris ");

        int value = 1;
        // Orijinal matrisin değerleri sırasıyla atanıyor ve ekrana yazdırılıyor
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                matris[r][c] = value;
                value++;
                System.out.print(matris[r][c] + "  ");
            }
            System.out.println();
        }

        // Ardından, transpoz matris oluşturuluyor
        int[][] transpozMatris = new int[col][row];
        System.out.println("---------");
        System.out.println("Transpoze ");
        // Transpoz matris ekrana yazdırılıyor
        for (int r = 0; r < transpozMatris.length; r++) {
            for (int c = 0; c < transpozMatris[r].length; c++) {
                // Orijinal matrisin transpozunu almak için değerler kopyalanıyor
                transpozMatris[r][c] = matris[c][r];
                System.out.print(transpozMatris[r][c] + "  ");
            }
            System.out.println();
        }
    }
}
