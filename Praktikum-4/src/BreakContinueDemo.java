public class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("Menggnakan break : ");
        for (int i = 1; i <= 10; i++){
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Menggunakan continue : ");
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0) {
                continue; // lewati angka genap, lanjut ke iterasi
            }
            System.out.println(i);
        }
    }
}
