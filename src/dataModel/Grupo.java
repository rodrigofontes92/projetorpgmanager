package dataModel;

import java.util.ArrayList;

/**
 * Classe que representa um Grupo de personagens
 * Um grupo pode conter vários personages
 */
public class Grupo {

    private int id;
    private String nome;
    private ArrayList<Personagem> membros;

    /**
     * Construtor completo da classe Grupo
     *
     * @param id Identificador do grupo
     * @param nome Nome do grupo
     */
    public Grupo(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    /**
     * Construtor utilizado antes da inserção na bd
     *
     * @param nome Nome do grupo
     */
    public Grupo(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    /**
     * Obtém o id do grupo
     *
     * @return id do grupo
     */
    public int getId() {
        return id;
    }

    /**
     * Define o id do grupo
     *
     * @param id Identificador do grupo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome do grupo
     *
     * @return nome do grupo
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do grupo
     *
     * @param nome Nome do grupo
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a lista de membros do grupo
     *
     * @return ArrayList contendo os personagens do grupo
     */
    public ArrayList<Personagem> getMembros() {
        return membros;
    }

    /**
     * Adiciona um personagem ao grupo
     *
     * @param personagem Personagem a ser adicionado
     */
    public void adicionarMembro(Personagem personagem) {
        membros.add(personagem);
    }

    /**
     * Remove um personagem do grupo
     *
     * @param personagem Personagem a ser removido
     */
    public void removerMembro(Personagem personagem) {
        membros.remove(personagem);
    }

    /**
     * Retorna os membros do grupo
     *
     * @return String contendo os membros formatados
     */
    public String listarMembros() {
        String texto = "";

        for (Personagem p : membros) {
            texto += "ID: " + p.getId()
                    + " | Nome: " + p.getNome()
                    + " | Nível: " + p.getNivel()
                    + "\n";
        }

        return texto;
    }
}
