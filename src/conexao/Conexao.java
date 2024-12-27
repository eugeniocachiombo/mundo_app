package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public Connection getConexao() {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mundo?serverTimezone=UTC",
                    "root",
                    ""
            );
            return con;
        } catch (Exception e) {
            System.out.println("Erro de conexão: " + e.getMessage());
            return null;
        }
    }
}
