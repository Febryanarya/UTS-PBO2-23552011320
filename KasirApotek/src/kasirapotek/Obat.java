package kasirapotek;
public class Obat {
    private int id;
    private String nama;
    private double harga;
    private int stok;

    public Obat(int id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }
}
