import java.util.Scanner;

public class NilaiUjian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Nila Ujian Akhir: ");
        double nilai = scanner.nextDouble();

        if (nilai > 100){
            System.out.println("Nilainya kelebihan bro");
            scanner.close();
            return;
        }

        String status;
        if (nilai >= 60) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }

        System.out.println("\nNama Mahasiswa: " + nama);
        System.out.println("Status Kelulusan: " + status);

        scanner.close();
    }
}

//Deskripsi Formal
//P = { Inputkan Nama Mahasiswa(String) dan Nilai Ujian Akhir(double) }
//C = Menentukan status kelulusan if (nilai >= 60) maka Lulus jika else maka Tidak Lulus
//Q = Menampilakan Nama Mahasiswa dan Status Kelulusan


//Deskripsi Informal
//Program ini dibuat untuk seorang guru dalam menentukan apakah mahasiswanya lulus ujian akhir atau tidak berdasarkan nilai yang didapatkannya.
//Guru akan memasukkan nama mahasiswa dan nilai ujiannya ke dalam program.
//Jika nilai yang dimasukkan lebih besar atau sama dengan 60, maka mahasiswa dinyatakan "lulus".
//Jika nilai yang dimasukkan kurang dari 60, maka mahasiswa dinyatakan "Tidak Lulus".