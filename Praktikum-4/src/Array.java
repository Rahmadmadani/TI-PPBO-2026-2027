import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Masukkan 10 angka:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("\nArray dalam urutan terbalik:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
