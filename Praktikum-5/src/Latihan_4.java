import java.util.Scanner;

public class Latihan_4 {
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if(data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai: ");
        int jumlah = sc.nextInt();

        int[] nilaiUjian = new int[jumlah];

        System.out.println("\nMasukkan " + jumlah + "nilai ujian: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai ke - " + (i + 1) + ": ");
            nilaiUjian[i] = sc.nextInt();
        }
        cariNilaiMinimum(nilaiUjian);
        cariNilaiMaksimum(nilaiUjian);

        System.out.println("\n Hasil Analisis Nilai ");
        System.out.println("Nilai Minimum : " + cariNilaiMinimum(nilaiUjian));
        System.out.println("Nilai Maximum : " + cariNilaiMaksimum(nilaiUjian));

        sc.close();
    }
}
