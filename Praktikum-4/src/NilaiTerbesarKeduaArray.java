import java.util.Scanner;

public class NilaiTerbesarKeduaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Ukuran array minimal harus 2!");
            sc.close();
            return;
        }

        int[] array = new int[n];
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int terbesar = Integer.MIN_VALUE;
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (array[i] > terbesar) {
                terbesarKedua = terbesar;
                terbesar = array[i];
            } else if (array[i] > terbesarKedua && array[i] != terbesar) {
                terbesarKedua = array[i];
            }
        }

        if (terbesarKedua == Integer.MIN_VALUE) {
            System.out.println("Tidak ada nilai terbesar kedua (semua elemen bernilai sama).");
        } else {
            System.out.println("Nilai terbesar pertama: " + terbesar);
            System.out.println("Nilai terbesar kedua: " + terbesarKedua);
        }

        sc.close();
    }
}