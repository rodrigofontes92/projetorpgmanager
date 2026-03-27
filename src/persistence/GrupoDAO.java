package persistence;

import dataModel.*;
import java.sql.*;
import java.util.ArrayList;

/**
 * @author Rodrigo Fontes
 * 
 * Classe DAO responsável pelas operações da entidade Grupo.
 *
 * Além ddo CRUD, também controla a associação entre grupos e personagens através da tabela grupo_personagem.
 */
public class GrupoDAO {

    /**
     * Insere um novo grupo na base de dados.
     * @param g objeto tipo Grupo
     * @throws SQLException caso erro ao inserir grupo
     */
    public void inserir(Grupo g) throws SQLException {
        DBWorker db = new DBWorker();
        Connection con = db.getConnection();
        Statement st = con.createStatement();
        String sql = "INSERT INTO grupo (nome) VALUES ('" + g.getNome() + "')";
        System.out.println(sql);

        st.executeUpdate(sql);
        st.close();
        db.close();
    }

    /**
     * Lista todos os grupos existentes na base de dados.
     * 
     * @return lista dos grupos da BD
     * @throws SQLException caso erro ao listar grupo
     */
    public ArrayList<Grupo> listar() throws SQLException {
        ArrayList<Grupo> lst = new ArrayList<>();
        DBWorker db = new DBWorker();
        Connection con = db.getConnection();
        Statement st = con.createStatement();
        String sql = "SELECT * FROM grupo";
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            lst.add(new Grupo(id, nome));
        }
        rs.close();
        st.close();
        db.close();

        return lst;
    }

    /**
     * Remove um grupo da base de dados utilizando o ID.
     * 
     * @param id remove o grupo através do ID
     * @throws SQLException caso erro ao remover um grupo
     */
    public void remover(int id) throws SQLException {
        DBWorker db = new DBWorker();
        Connection con = db.getConnection();
        Statement st = con.createStatement();
        String sql = "DELETE FROM grupo WHERE id = " + id;
        st.executeUpdate(sql);
        st.close();
        db.close();
    }

    /**
     * Associa um personagem a um grupo para criar um registo na tabela grupo_personagem.
     * 
     * @param grupoId 
     * @param personagemId 
     * @throws SQLException caso erro ao adicionar personagem
     */
    public void adicionarPersonagem(int grupoId, int personagemId) throws SQLException {
        DBWorker db = new DBWorker();
        Connection con = db.getConnection();
        Statement st = con.createStatement();
        String sql = "INSERT INTO grupo_personagem (grupo_id, personagem_id) VALUES (" + grupoId + ", " + personagemId + ")";
        st.executeUpdate(sql);
        st.close();
        db.close();
    }

    /**
     * Lista todos os personagens que pertencem a um determinado grupo.
     *
     * O método faz um JOIN entre as tabelas personagem e grupo_personagem
     * 
     * @param grupoId
     * @return lista dos personagens de um determinado grupo
     * @throws SQLException caso erro ao listar membros
     */
    public ArrayList<Personagem> listarMembros(int grupoId) throws SQLException {
        ArrayList<Personagem> lst = new ArrayList<>();
        DBWorker db = new DBWorker();
        Connection con = db.getConnection();
        Statement st = con.createStatement();
        String sql = "SELECT p.* FROM personagem p JOIN grupo_personagem gp ON p.id = gp.personagem_id WHERE gp.grupo_id = " + grupoId;
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            int vida = rs.getInt("vida");
            int experiencia = rs.getInt("experiencia");
            int nivel = rs.getInt("nivel");
            String tipo = rs.getString("tipo");

            if (tipo.equals("GUERREIRO")) {
                int forca = rs.getInt("forca");
                lst.add(new Guerreiro(id, nome, vida, experiencia, nivel, forca));
            }
            else if (tipo.equals("MAGO")) {
                int magia = rs.getInt("magia");
                lst.add(new Mago(id, nome, vida, experiencia, nivel, magia));
            }
            else if (tipo.equals("CLERIGO")) {
                int fe = rs.getInt("fe");
                lst.add(new Clerigo(id, nome, vida, experiencia, nivel, fe));
            }
        }
        rs.close();
        st.close();
        db.close();

        return lst;
    }
}