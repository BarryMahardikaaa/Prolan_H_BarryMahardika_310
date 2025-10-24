package Before;

import java.util.Scanner;

public class MainParkir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistem Penghitung Biaya Parkir ===");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Pilih jenis kendaraan: ");
        int pilih = sc.nextInt();

        Kendaraan kendaraan;
        if (pilih == 1) {
            kendaraan = new Mobil();
        } else if (pilih == 2) {
            kendaraan = new Motor();
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        System.out.print("Masukkan lama parkir (jam): ");
        int lama = sc.nextInt();

        int biaya = kendaraan.hitungBiaya(lama);

        System.out.println("Jenis kendaraan: " + kendaraan.jenis);
        System.out.println("Lama parkir: " + lama + " jam");
        System.out.println("Total biaya: Rp" + biaya);
    }
}