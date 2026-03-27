package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por estabelecer e gerir a ligação à base de dados MySQL da aplicação.
 * 
 * Esta classe é utilizada pelas classes DAO da camada de persistência para executar operações CRUD
 * 
 * @author Rodrigo Fontes
 */
public class DBWorker {

    private String baseDados = "xxxxxx";
    private String servidor = "xxx.xxx.xxx.xxx";
    private String user = "xxxxx";
    private String password = "xxxxx";
    private String stringConnection =
            "jdbc:mysql://" + servidor + ":xxxx/" + baseDados;

    private Connection con;

    /**
     * Construtor de DBWorker, cria uma ligação à BD utilizando DriverManager
     * 
     * @throws SQLException caso ocorra erro de conexão à BD
     */
    public DBWorker() throws SQLException {
        con = DriverManager.getConnection(stringConnection, user, password);
    }

    /**
     * Método usado pelas classes DAO para obter conexão e execução de consultas SQL
     * 
     * @return objeto {@link Connection}
     */
    public Connection getConnection() {
        return con;
    }

    /**
     * Método que fecha a conexão, chamado após execução das operações necessárias
     * 
     * @throws SQLException caso erro ao fechar conexão
     */
    public void close() throws SQLException {
        if (con != null)
            con.close();
    }
}
