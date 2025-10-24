import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Codelab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usia = -1;
        boolean ulang = false;

        while (!ulang){
            try {
                System.out.print("Masukkan usia kamu: ");
                usia = input.nextInt();
                if (usia <= 0 || usia >= 120) {
                    throw new InvalidAgeException("Usia tidak memenuhi! Tolong masukkan usia lebih besar dari 0 dan kurang dari 120");
                }
                ulang = true;
                System.out.println("Usia kamu adalah: " + usia);
            } catch (InvalidAgeException e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Input tidak valid! Tolong masukkan input berupa angka.");
                input.nextLine();
            }
        }
        input.close();

    }
}