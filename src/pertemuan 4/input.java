import java.util.Scanner;

public class input {
    public static void main(String[] Args) {
        String nama, alamat;
        int usia, gaji;

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Pendataan Karyawan PT.ABC");
            System.out.print("Nama Karyawan : ");

            nama = keyboard.next();

            System.out.print("Alamat : ");

            alamat = keyboard.next();

            System.out.print("Usia : ");

            usia = keyboard.nextInt();

            System.out.print("Gaji : ");

            gaji = keyboard.nextInt();
        }

        // cetak ke layar

        System.out.print("_________________________");
        System.out.print("Nama Karyawan : " + nama);

        System.out.print("Alamat : " + alamat);

        System.out.print("Usia : " + usia);

        System.out.print("Gaji : " + gaji);

    }
}
