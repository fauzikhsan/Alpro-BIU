import java.util.Scanner;

public class lingkaran {
    public static void main(String[] args) {

        // Inisialisasi objek input dari class scanner
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double luas, phi = 3.14;
        int r;

        // Input nilai jari-jari
        System.out.print("Masukan Jari-jari : ");
        r = input.nextInt();

        // Menghitung luas lingkaran
        luas = phi * r * r;

        // Tampilkan hasil
        System.out.println("Luas Lingkaran = " + luas);
    }
}