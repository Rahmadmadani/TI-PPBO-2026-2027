import java.util.Scanner;

public class Latihan_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int bilangan = sc.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
        sc.close();
    }
}

