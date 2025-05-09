package kasirapotek;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PasienService {
    public void tambahPasien(int id, String nama, int umur) {
        try (Connection conn = DatabaseConnection.connect()) {
            String sql = "INSERT INTO pasien (id, nama, umur) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, nama);
            stmt.setInt(3, umur);
            stmt.executeUpdate();
            System.out.println("Data pasien berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println("Gagal tambah pasien: " + e.getMessage());
        }
    }
}
