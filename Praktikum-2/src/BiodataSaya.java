import java.util.Scanner; // mengimport library untuk menerima inputan user

public class BiodataSaya {
    public static void main(String[] args) {
        int umur = 19;
        double tinggi = 163.0;
        char inisial = 'R';
        boolean statusMahasiswa = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("nama : ");
        String nama = sc.nextLine();

        System.out.print("NIM : ");
        String nim = sc.nextLine(); // untuk menerima inputan dari user

        System.out.print("Program Studi : ");
        String prodi = sc.nextLine();

        System.out.println("Nama : " + nama + " \nNIM : " + nim + " \nProgram Studi : " + prodi);

        System.out.println(umur);
        System.out.println(tinggi);
        System.out.println(inisial);
        System.out.println(statusMahasiswa);

    }
}