public class Latihan_5 {
    static int hitungTotal(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total = total + data[i];
        }
        return total;
    }
    static int[] filterDiatasRataRata(int[] data) {
        double rataRata = (double) hitungTotal(data) / data.length;

        int jumlahDiAtasRata = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > rataRata) {
                jumlahDiAtasRata++;
            }
        }

        int[] hasil = new int[jumlahDiAtasRata];

        int indeksHasil = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >rataRata) {
                hasil[indeksHasil] = data[i];
                indeksHasil++;
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        int[] nilai = {60, 75, 80, 90, 50, 85};

        int total = hitungTotal(nilai);
        System.out.println("Total Nilai : " + total);

        int [] hasilFilter = filterDiatasRataRata(nilai);


        System.out.print("Nilai di atas rata-rata : ");
        for (int i = 0; i < hasilFilter.length; i ++) {
           System.out.print(hasilFilter[i] + " ");
        }
        System.out.println();
    }
}
