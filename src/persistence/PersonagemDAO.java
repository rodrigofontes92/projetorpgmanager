package persistence;

import dataModel.*;
import java.sql.*;
import java.util.ArrayList;

/**
 * @author Rodrigo Fontes
 * 
 * Classe responsável por comunicar com a base de dados para realizar operações relacionadas aos personagens.
 */
public class PersonagemDAO {

    /**
     * Insere um novo personagem na base de dados.
     *
     * O método identifica o tipo do personagem (Guerreiro, Mago ou Clérigo) utilizando instanceof e monta o SQL correspondente.
     *
     * @param personagem
     * @throws SQLException caso erro ao inserir personagem
     */
    public void inserir(Personagem p) throws SQLException {
        DBWorker db = new DBWorker();
        Connection con = db.getConnection();
        Statement st = con.createStatement();

        String tipo = "";
        int forca = 0;
        int magia = 0;
        int fe = 0;

        if (p instanceof Guerreiro) {
            tipo = "GUERREIRO";
            forca = ((Guerreiro) p).getForca();
        }
        else if (p instanceof Mago) {
            tipo = "MAGO";
            magia = ((Mago) p).getMagia();
        }
        else if (p instanceof Clerigo) {
            tipo = "CLERIGO";
            fe = ((Clerigo) p).getFe();
        }

        String sql =
            "INSERT INTO personagem (nome, vida, experiencia, nivel, tipo, forca, magia, fe) VALUES ('"
            + p.getNome() + "',"
            + p.getVida() + ","
            + p.getExperiencia() + ","
            + p.getNivel() + ",'"
            + tipo + "',"
            + forca + ","
            + magia + ","
            + fe + ")";

        st.executeUpdate(sql);
        st.close();
        db.close();
    }

    /**
     * Lista todos os personagens existentes na base de dados.
     *
     * O método lê cada linha da tabela personagem e cria o objeto correto (Guerreiro, Mago ou Clerigo).
     * 
     * @return lista dos personagens
     * @throws SQLException caso erro ao listar personagens
     */
    public ArrayList<Personagem> listar() throws SQLException {
        ArrayList<Personagem> lst = new ArrayList<>();
        DBWorker db = new DBWorker();
        Connection con = db.getConnection();
        Statement st = con.createStatement();
        String sql = "SELECT * FROM personagem";
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

    /**
     * Remove um personagem da base de dados a partir do seu ID.
     * 
     * @param id
     * @throws SQLException caso erro ao remover um personagem
     */
    public void remover(int id) throws SQLException {
        DBWorker db = new DBWorker();
        Connection con = db.getConnection();
        Statement st = con.createStatement();
        String sql = "DELETE FROM personagem WHERE id = " + id;
        st.executeUpdate(sql);
        st.close();
        db.close();
    }

    /**
     * Atualiza os dados básicos de um personagem.
     *
     * Apenas nome e vida são atualizados.
     * 
     * @param personagem
     * @throws SQLException caso erro ao atualizar personagem
     */
    public void atualizar(Personagem p) throws SQLException {
        DBWorker db = new DBWorker();
        Connection con = db.getConnection();
        Statement st = con.createStatement();
        String sql = "UPDATE personagem SET nome = '" + p.getNome() + "', vida = " + p.getVida() + " WHERE id = " + p.getId();
        st.executeUpdate(sql);
        st.close();
        db.close();
    }
}