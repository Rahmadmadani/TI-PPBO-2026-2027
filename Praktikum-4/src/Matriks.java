import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriks = new int[3][3];
        int totalSeluruhnya = 0;

        System.out.println("Masukkan elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriks[" + i + "][" + j + "]: ");
                matriks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nHasil Perhitungan");
        for (int i = 0; i < 3; i++) {
            int jumlahBaris = 0;
            for (int j = 0; j < 3; j++) {
                jumlahBaris += matriks[i][j];
            }
            totalSeluruhnya += jumlahBaris;
            System.out.println("Jumlah Baris ke-" + (i + 1) + ": " + jumlahBaris);
        }

        System.out.println("Total seluruh elemen matriks: " + totalSeluruhnya);

        sc.close();
    }
}
