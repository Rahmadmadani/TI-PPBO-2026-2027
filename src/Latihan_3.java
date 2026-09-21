import java.util.Scanner;

public class Latihan_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Soto");
        System.out.print("Masukkan pilihan (1-4): ");

        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Nasi Goreng");
                break;

            case 2:
                System.out.println("Mie Ayam");
                break;

            case 3:
                System.out.println("Bakso");
                break;

            case 4:
                System.out.println("Soto");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        sc.close();
    }
}
