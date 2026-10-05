import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nilai KKM standar kelulusan
        double kkm = 70.0;

        System.out.println("==================================================");
        System.out.println("          PROGRAM PENGOLAH NILAI KELAS           ");
        System.out.println("==================================================");

        // Ambil input jumlah mahasiswa dari user
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        // Buat array sesuai jumlah mahasiswa
        double[] nilai = new double[n];

        System.out.println("\n--- Input Nilai Ujian Mahasiswa ---");
        // Loop buat ngisi data nilai satu per satu
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextDouble();
        }

        // Copy nilai asli ke array baru biar punya cadangan sebelum di-sort
        double[] nilaiAwal = new double[n];
        for (int i = 0; i < n; i++) {
            nilaiAwal[i] = nilai[i];
        }

        // Variabel penampung statistik
        double total = 0;
        double nilaiTertinggi = nilai[0];
        double nilaiTerendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        // Loop untuk hitung total, min, max, dan status kelulusan
        for (int i = 0; i < n; i++) {
            total += nilai[i]; // Tambah total buat nyari rata-rata nanti

            // Update nilai max kalau ketemu yang lebih gede
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }

            // Update nilai min kalau ketemu yang lebih kecil
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }

            // Cek lulus atau enggak berdasarkan KKM
            if (nilai[i] >= kkm) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Hitung rata-rata
        double rataRata = total / n;

        // Urutkan nilai dari kecil ke besar pakai Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Kalau angka depan lebih besar dari belakang, tukar posisinya
                if (nilai[j] > nilai[j + 1]) {
                    double temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // Tampilkan ringkasan laporan
        System.out.println("\n==================================================");
        System.out.println("             LAPORAN HASIL UJIAN KELAS            ");
        System.out.println("==================================================");
        System.out.printf("Batas KKM Kelulusan    : %.2f\n", kkm);
        System.out.println("Jumlah Total Mahasiswa : " + n + " orang");
        System.out.println("--------------------------------------------------");
        System.out.printf("Nilai Rata-Rata Kelas  : %.2f\n", rataRata);
        System.out.printf("Nilai Tertinggi        : %.2f\n", nilaiTertinggi);
        System.out.printf("Nilai Terendah         : %.2f\n", nilaiTerendah);
        System.out.println("--------------------------------------------------");
        System.out.println("Jumlah Mahasiswa Lulus : " + jumlahLulus + " orang");
        System.out.println("Jumlah Tidak Lulus     : " + jumlahTidakLulus + " orang");
        System.out.println("--------------------------------------------------");

        // Tampilkan array sebelum sorting
        System.out.print("Nilai Sebelum Diurutkan: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiAwal[i] + (i < n - 1 ? ", " : " "));
        }
        System.out.println("]");

        // Tampilkan array sesudah sorting
        System.out.print("Nilai Sesudah Diurutkan: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + (i < n - 1 ? ", " : " "));
        }
        System.out.println("]");
        System.out.println("==================================================");

        // Tutup scanner
        sc.close();
    }
}