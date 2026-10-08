public class Latihan {
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }
    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }
    static boolean isPrima(int n) {
        if ( n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static double konversiSuhu(double C) {
        return (C * 1.8) + 32;
    }
    static double konversiSuhu(double C, String skalaTujuan) {
        if (skalaTujuan == "Kelvin") {
            return C + 273.15;
        } else if (skalaTujuan == "Fahrenheit") {
            return (C * 1.8) + 32;
        }
        return C;
    }


    public static void main(String[] args) {
        System.out.println(luasPersegiPanjang(9, 10));
        System.out.println(luasLingkaran(10));

        System.out.println("Bilangan prima dari 1 sampai 50: ");
        for (int i = 1; i <= 50; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        double k1 = konversiSuhu(25, "Kelvin");
        System.out.println("ke Kelvin: " + k1);

        double f1 = konversiSuhu(25, "Fahrenheit");
        System.out.println("ke Fahrenheit: " + f1);

    }
}
