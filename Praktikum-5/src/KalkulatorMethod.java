import java.util.Scanner;

public class KalkulatorMethod {

    // seluruh operasi
    static double tambah(double a, double b) { // fungsi untuk penjumahan
        return a + b;
    }
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }
    static double kurang(double a, double b) { // fungsi untuk pengurangan
        return a - b;
    }
    static double kali(double a, double b) { // fungsi untuk perkalian
        return a * b;
    }
    static double bagi(double a, double b) { // fungsi untuk pembagian
        return a / b;
    }
    static double pangkat(double alas, double eksponen) {
        return Math.pow(alas, eksponen);
    }
    static double akarKuadrat(double angka) { // fungsi untuk kuadrat
        if (angka < 0) {
            System.out.println("Akar dari bilangan negatif menghasilkan angak imajiner!");
            return 0;
        }
        return Math.sqrt(angka);
    }

    //    METHOD UNTUK MENCARI RIWAYAT MAKSIMUM

    //  Method riwayatKeMaksimum
    static double riwayatKeMaksimum(double[] riwayatHasil, int jumlahData) {
        if (jumlahData == 0) {
            return 0;
        }

        double max = riwayatHasil[0];
        // Mencari nilai terbesar dari array riwayat menggunakan perulangan indeks
        for (int i = 1; i < jumlahData; i++) {
            if (riwayatHasil[i] > max) {
                max = riwayatHasil[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] riwayatHasil = new double[100];
        int jumlahRiwayat = 0;

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n============================================");
            System.out.println("         PROGRAM KALKULATOR METHOD    ");
            System.out.println("===========================================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Penjumlahan (3 angka) [overloading]");
            System.out.println("3. Pengurangan");
            System.out.println("4. Perkalian");
            System.out.println("5. Pembagian");
            System.out.println("6. Perpangkatan");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar & lihat hasil maksimum");
            System.out.println("===========================================");
            System.out.print("Pilih menu (1 - 8) :");

            int pilihan = sc.nextInt();
            double hasil = 0;
            boolean simpanKeRiwayat = true;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama : ");
                    double a1 = sc.nextDouble();
                    System.out.print("Masukkan angka kedua : ");
                    double a2 = sc.nextDouble();
                    hasil = tambah(a1, a2);
                    System.out.println("Hasil : " + a1 + " + " + a2 + " = " +  hasil);
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama : ");
                    double b1 = sc.nextDouble();
                    System.out.print("Masukkan angka kedua : ");
                    double b2 = sc.nextDouble();
                    System.out.print("Masukkan angka ketiga : ");
                    double b3 = sc.nextDouble();
                    hasil = tambah(b1, b2, b3);
                    System.out.println("Hasil " +b1+ " + " +b2+ " + " +b3+ " = " + hasil);
                    break;

                case 3:
                    System.out.print("masukkan angka pertama : ");
                    double c1 = sc.nextDouble();
                    System.out.print("Masukkan angka kedua : ");
                    double c2 = sc.nextDouble();
                    hasil = kurang(c1, c2);
                    System.out.println("Hasil " +c1+ " + " +c2+ " = " + hasil);
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama : ");
                    double d1 = sc.nextDouble();
                    System.out.print("Masukkan angka kedua : ");
                    double d2 = sc.nextDouble();
                    hasil = kali(d1, d2);
                    System.out.println("Hasil " +d1+ " + " +d2+ " = " +hasil);
                    break;

                case 5 :
                    System.out.print("Masukkan angka pertama : ");
                    double e1 = sc.nextDouble();
                    System.out.print("Masukkan angka kedua : ");
                    double e2 = sc.nextDouble();
                    hasil = bagi(e1, e2);
                    System.out.println("Hasil " +e1+ " + " +e2+ " = " +hasil);
                    break;

                case 6 :
                    System.out.print("Masukkan angkka alas : ");
                    double alas = sc.nextDouble();
                    System.out.print("Masukkan angka pangkat : ");
                    double eksponen = sc.nextDouble();
                    hasil = pangkat(alas, eksponen);
                    System.out.println("Hasil : " +alas+ " ^ " +eksponen);
                    break;

                case 7 :
                    System.out.print("Masukkan angka : ");
                    double angkaAkar = sc.nextDouble();
                    hasil = akarKuadrat(angkaAkar);
                    System.out.println("Hasil : √" +angkaAkar+ " = " +hasil);
                    break;

                case 8 :
                    berjalan = false;
                    simpanKeRiwayat = false; // Opsi keluar tidak perlu disimpan ke riwayat
                    break;

                default :
                    System.out.println("Pilihan menu tidak valid");
                    simpanKeRiwayat = false;
                    break;
            }
        }
        // Output saat pengguna keluar dari program
        System.out.println("\n=================================");
        System.out.println("        RINGKASAN SESI           ");
        System.out.println("=================================");
        System.out.println("Total transaksi dilakukan : " + jumlahRiwayat);

        if (jumlahRiwayat > 0) {
            double maksimum = riwayatKeMaksimum(riwayatHasil, jumlahRiwayat);
            System.out.println("Hasil perhitungan TERBESAR: " + maksimum);
        } else {
            System.out.println("Belum ada perhitungan yang dilakukan.");
        }

        System.out.println("Terima kasih telah menggunakan kalkulator!");
        sc.close();
    }
}
