import java.util.Scanner;

public class Main {
    public static void validateNumber(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Error: Angka harus positif, bukan " + number);
        }
        System.out.println("Valid: Angka " + number + " adalah positif.");
    }

    public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Masukkan angka: ");
                int input = scanner.nextInt();

                validateNumber(input);

            } catch (InvalidNumberException e) {
                System.out.println("Exception tertangkap -> " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Input tidak valid, harap masukkan angka!");
            }
        }
    }
