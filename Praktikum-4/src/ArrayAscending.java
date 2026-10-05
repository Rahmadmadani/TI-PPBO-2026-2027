import java.util.Scanner;

public class ArrayAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Tampilkan sebelum diurutkan
        System.out.print("\nArray SEBELUM diurutkan: ");
        tampilkanArray(array);

        // Algoritma Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Tukar posisi elemen
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Tampilkan sesudah diurutkan
        System.out.print("Array SESUDAH diurutkan (Ascending): ");
        tampilkanArray(array);

        sc.close();
    }

    // Fungsi pembantu untuk mencetak array
    public static void tampilkanArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}