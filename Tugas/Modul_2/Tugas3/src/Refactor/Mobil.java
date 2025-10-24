package Refactor;

public class Mobil extends Kendaraan {

    public static final int TARIF_AWAL = 5000;
    public static final int TARIF_PER_JAM = 3000;

    public Mobil() {
        super("Mobil", TARIF_AWAL, TARIF_PER_JAM);
    }
}