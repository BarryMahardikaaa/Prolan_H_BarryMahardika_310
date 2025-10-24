package Refactor;

public class Motor extends Kendaraan {

    public static final int TARIF_AWAL = 3000;
    public static final int TARIF_PER_JAM = 2000;

    public Motor() {
        super("Motor", TARIF_AWAL, TARIF_PER_JAM);
    }
}