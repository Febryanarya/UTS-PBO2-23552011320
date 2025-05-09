package kasirapotek;
public class Main {
    public static void main(String[] args) {
        Dokter dokter = new Dokter(1, "Dr. Lani");
        Apoteker apoteker = new Apoteker(2, "Ani");

        dokter.verifikasiResep();
        apoteker.verifikasiResep();

        Pasien pasien = new Pasien(10, "Budi", 30);
        Obat paracetamol = new Obat(1, "Paracetamol", 5000, 100);

        double total = paracetamol.getHarga() * 2;
        Transaksi trx = new Transaksi(1001, pasien.getId(), total, new java.util.Date());
        trx.tampilkanTransaksi();
    }
}
