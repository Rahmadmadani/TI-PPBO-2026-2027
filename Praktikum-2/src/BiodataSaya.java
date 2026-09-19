import java.util.Scanner; // mengimport library untuk menerima inputan user

public class BiodataSaya {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("nama : ");
        String nama = sc.nextLine();

        System.out.print("NIM : ");
        String nim = sc.nextLine(); // untuk menerima inputan dari user

        System.out.print("Program Studi : ");
        String prodi = sc.nextLine();

        System.out.print("Nama : " + nama + " - NIM : " + nim + " - Program Studi : " + prodi);

    }
}