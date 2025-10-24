package Before;

public class Kendaraan {
    public String jenis;
    public int TA;
    public int TPJ;

    public Kendaraan(String jenis, int tarifAwal, int tarifPerJam) {
        this.jenis = jenis;
        this.TA = tarifAwal;
        this.TPJ = tarifPerJam;
    }

    public int hitungBiaya(int lamaParkir) {
        int total = TA;
        if (lamaParkir > 2) {
            total += (lamaParkir - 2) * TPJ;
        }
        return total;
    }
}