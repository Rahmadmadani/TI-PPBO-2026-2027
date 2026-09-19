import java.util.Scanner;

public class KalkulatorBangunDatar{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // agar dapat menyimpan data dari inputan user

        /*menghitung dan menampilkan
         luas serta kelilingpersegi panjang*/
        System.out.print("Masukkan panjang : "); // input pangjang persegi panjang
        double panjang = sc.nextDouble();
        System.out.print("Masukkan lebar : "); // input lebar persegi panjang
        double lebar = sc.nextDouble();

        double luas = panjang * lebar; // rumus menghitung luas
        double keliling = 2 * (panjang + lebar); // rumus menghitung keliling


        /*menghitung dan menampilkan luas serta keliling lingkaran
         menggunakan Math.Pi*/
        System.out.print("Masukkan jari-jari lingkaran : "); // input nilai jari-jari
        double jari = sc.nextDouble();

        double luasLingkaran = 3.14 * jari * jari; // rumus luas lingkaran
        double kelilingLingkaran = 2 * 3.14 * jari; // rumus keliling lingkaran

        System.out.println("Luas lingkaran : " + luasLingkaran); //output
        System.out.println("Keliling lingkaran : " + kelilingLingkaran); //output

        /*menyimpan hasil luas persegi panjang
         ke dalam variable boolean*/
        boolean luasBesar = luas > 100; // metode mengetahui true or false
        System.out.println("Apakah " + luas + " lebih dari 100 :" + luasBesar); //output
        System.out.println("Luas persegi panjang : " + luas); // output

        sc.close();
    }
}
