import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:documentos/banco_dados";

        try {
            // Estabelece a conexão com o banco de dados SQLite
            Connection conn = DriverManager.getConnection(url);

            if (conn != null) {
                System.out.println("Conexão bem-sucedida ao banco de dados SQLite!");
                conn.close(); // Fecha a conexão
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados SQLite: " + e.getMessage());
        }
    }
}
