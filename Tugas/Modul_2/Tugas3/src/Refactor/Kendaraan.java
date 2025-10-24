package Refactor;

public class Kendaraan {
    public static final int BATAS_AWAL_JAM = 2;
    private String jenis;
    private int tarifAwal;
    private int tarifPerJam;

    public Kendaraan(String jenis, int tarifAwal, int tarifPerJam) {
        this.setJenis(jenis);
        this.setTarifAwal(tarifAwal);
        this.setTarifPerJam(tarifPerJam);
    }

    public int hitungBiaya(int lamaParkir) {
        int total = getTarifAwal();
        if (lamaParkir > 2) {
            total += (lamaParkir - BATAS_AWAL_JAM) * getTarifPerJam();
        }
        return total;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getTarifAwal() {
        return tarifAwal;
    }

    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }

    public int getTarifPerJam() {
        return tarifPerJam;
    }

    public void setTarifPerJam(int tarifPerJam) {
        this.tarifPerJam = tarifPerJam;
    }
}