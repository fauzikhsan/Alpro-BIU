import java.util.Scanner;

public class kontrol {
    public static void main(String[] Args) {
        String nama;
        int nilai;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Nama Karyawan : ");

            nama = keyboard.next();

            System.out.print("Nilai : ");

            nilai = keyboard.nextInt();
        }

        if (nilai >= 80) {
            System.out.print("Selamat " + nama + ", Anda Lulus dengan nilai sempurna");

        } else if (nilai >= 70) {

            System.out.print("Selamat " + nama + ", Anda Lulus dengan nilai baik");

        } else if (nilai >= 60) {

            System.out.print("Maaf ya " + nama + ", Anda belum lulus");
        } else {
            System.out.print("Bubarrr");
        }
    }
}
