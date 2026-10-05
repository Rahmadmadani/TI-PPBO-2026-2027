public class MethodDemo {
    // Method Void : Tidak mmengembalikan nilai apapun
    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }
    static void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println(nama + " (" +umur+ " tahun) - " +kota);
    }

    public static void main(String[] args) {
        sapa("Rahmad");
        sapa("Madani");
        sapa("Ellshiki");
        tampilkanBiodata("Rahmad", 20, "Takengon");
    }
}
