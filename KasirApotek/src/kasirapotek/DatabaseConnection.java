package kasirapotek;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost:127.0.0.1/kasir_apotek";
        String user = "root";
        String password = ""; // ganti jika perlu
        return DriverManager.getConnection(url, user, password);
    }
}
