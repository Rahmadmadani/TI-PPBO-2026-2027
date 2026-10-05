import java.util.Scanner;

public class SegitigaTerbalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan ukuran/tinggi pola: ");
        int n = sc.nextInt();

        // 1. Pola Segitiga Terbalik
        System.out.println("\nPola Segitiga Terbalik");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2. Pola Persegi
        System.out.println("\nPola Persegi");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
