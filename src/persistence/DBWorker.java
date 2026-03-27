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

    private String baseDados = "efa0125_projetojava_14bd";
    private String servidor = "62.28.39.135";
    private String user = "efa0125";
    private String password = "123.Abc";
    private String stringConnection =
            "jdbc:mysql://" + servidor + ":3306/" + baseDados;

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
