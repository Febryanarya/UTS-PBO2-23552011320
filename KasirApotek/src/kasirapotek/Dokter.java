package kasirapotek;
public class Dokter extends TenagaMedis {
    public Dokter(int id, String nama) {
        super(id, nama);
    }

    @Override
    public void verifikasiResep() {
        System.out.println("Resep diverifikasi oleh Dokter " + nama);
    }
}
