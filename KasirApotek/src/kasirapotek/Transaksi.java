package kasirapotek;
import java.util.Date;

public class Transaksi {
    private int id;
    private int pasienId;
    private double total;
    private Date tanggal;

    public Transaksi(int id, int pasienId, double total, Date tanggal) {
        this.id = id;
        this.pasienId = pasienId;
        this.total = total;
        this.tanggal = tanggal;
    }

    public void tampilkanTransaksi() {
        System.out.println("Transaksi ID: " + id + ", Total: " + total);
    }
}
