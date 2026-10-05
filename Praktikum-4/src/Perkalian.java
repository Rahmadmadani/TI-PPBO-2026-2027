import java.util.Scanner;

public class Perkalian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        System.out.println("Tabel Perkalian " + angka + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }

        sc.close();
    }
}
