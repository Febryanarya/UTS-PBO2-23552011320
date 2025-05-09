package kasirapotek;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ObatService {
    public void tambahObat(int id, String nama, double harga, int stok) {
        try (Connection conn = DatabaseConnection.connect()) {
            String sql = "INSERT INTO obat (id, nama, harga, stok) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, nama);
            stmt.setDouble(3, harga);
            stmt.setInt(4, stok);
            stmt.executeUpdate();
            System.out.println("Data obat berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println("Gagal tambah obat: " + e.getMessage());
        }
    }
}
