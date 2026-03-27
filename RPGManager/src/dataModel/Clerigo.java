package dataModel;

/**
 * Classe que representa um Clérigo
 * Herda de Personagem e possui atributo específico fé
 */
public class Clerigo extends Personagem {

    private int fe;

    /**
     * Construtor completo
     */
    public Clerigo(int id, String nome, int vida, int experiencia, int nivel, int fe) {
        super(id, nome, vida, experiencia, nivel);
        this.fe = fe;
    }

    /**
     * Construtor para criação antes de inserir na base de dados
     */
    public Clerigo(String nome, int vida, int fe) {
        super(nome, vida);
        this.fe = fe;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    /**
     * Método específico do Clérigo
     * Não será usado no sistema, apenas para formalização.
     * 
     * @return valor da fé
     */
    public int curar() {
        return fe;
    }
}
