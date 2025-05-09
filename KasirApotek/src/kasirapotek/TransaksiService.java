package kasirapotek;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class TransaksiService {
    public void tambahTransaksi(int id, int pasienId, double total, java.util.Date tanggal) {
        try (Connection conn = DatabaseConnection.connect()) {
            String sql = "INSERT INTO transaksi (id, pasien_id, total, tanggal) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setInt(2, pasienId);
            stmt.setDouble(3, total);
            stmt.setDate(4, new Date(tanggal.getTime()));
            stmt.executeUpdate();
            System.out.println("Transaksi berhasil disimpan.");
        } catch (SQLException e) {
            System.out.println("Gagal tambah transaksi: " + e.getMessage());
        }
    }
}
