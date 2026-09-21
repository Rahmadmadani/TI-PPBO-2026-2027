import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Konstanta tarif listrik per kWh
        final double TARIF_450 = 500;
        final double TARIF_900 = 700;
        final double TARIF_1300 = 1000;
        final double TARIF_2200 = 1500;
        final double TARIF_DI_ATAS_2200 = 2000;

        // Menampilkan judul program
        System.out.println("======================================");
        System.out.println("       PROGRAM HITUNG TARIF LISTRIK");
        System.out.println("======================================");

        // Meminta input golongan daya
        System.out.print("Masukkan golongan daya (VA): ");
        int daya = input.nextInt();

        // Meminta input jumlah pemakaian listrik
        System.out.print("Masukkan pemakaian listrik (kWh): ");
        double kWh = input.nextDouble();

        /*Validasi input kWh.
         Jika kWh kurang dari 0 ATAU sama dengan 0,
         maka program menampilkan pesan error.*/
        if (kWh < 0 || kWh == 0) {
            System.out.println("\nERROR!");
            System.out.println("Pemakaian listrik harus lebih dari 0 kWh.");
            input.close();
            return;
        }

        // Variabel untuk menyimpan nama golongan dan tarif
        String golongan;
        double tarif;

        /*Menentukan golongan daya menggunakan*/
        switch (daya) {

            case 450:
                golongan = "450 VA";
                tarif = TARIF_450;
                break;

            case 900:
                golongan = "900 VA";
                tarif = TARIF_900;
                break;

            case 1300:
                golongan = "1300 VA";
                tarif = TARIF_1300;
                break;

            case 2200:
                golongan = "2200 VA";
                tarif = TARIF_2200;
                break;

            default:
                // Golongan di atas 2200 VA
                if (daya > 2200) {
                    golongan = "Di atas 2200 VA";
                    tarif = TARIF_DI_ATAS_2200;
                } else {
                    // Jika input daya tidak sesuai pilihan
                    System.out.println("\nERROR");
                    System.out.println("Golongan daya tidak valid");
                    input.close();
                    return;
                }
        }

        // Menghitung total tagihan
        double totalTagihan = kWh * tarif;

        // Menampilkan hasil perhitungan
        System.out.println("\n======================================");
        System.out.println("            HASIL TAGIHAN");
        System.out.println("======================================");
        System.out.println("Golongan Daya  : " + golongan);
        System.out.println("Pemakaian      : " + kWh + " kWh");
        System.out.println("Tarif per kWh  : Rp" + tarif);
        System.out.println("--------------------------------------");
        System.out.println("Total Tagihan  : Rp" + totalTagihan);
        System.out.println("======================================");

        // Menutup Scanner
        input.close();
    }
}
