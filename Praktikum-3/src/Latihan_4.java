import java.util.Scanner;

public class Latihan_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = sc.nextBoolean();

        int harga;

        if (mahasiswa && umur < 25) {
            harga = 20000;
        } else {
            harga = 35000;
        }

        System.out.println("Harga tiket: Rp" + harga);

        sc.close();
    }
}
