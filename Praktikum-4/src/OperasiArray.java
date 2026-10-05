public class OperasiArray {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 88};
        int total = 0;
        int max = nilai[0];
        int min = nilai[0];

        for (int n : nilai) {
            total += n; // sama dengan total = total + n;
        }
        double rataRata = (double) total / nilai.length;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai Maksimum: " + max);
        System.out.println("Nilai Minimum: " + min);
        System.out.println();

        // pencarian data linear

        int cari = 90;
        int posisi = -1;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Nilai " + cari + " ditemukan di indeks " + posisi);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan");
        }
    }
}
