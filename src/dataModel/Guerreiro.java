package dataModel;

/**
 * Classe que representa um Guerreiro
 * Herda de Personagem e possui atributo específico força
 */
public class Guerreiro extends Personagem {

    private int forca;

    /**
     * Construtor completo
     */
    public Guerreiro(int id, String nome, int vida, int experiencia, int nivel, int forca) {
        super(id, nome, vida, experiencia, nivel);
        this.forca = forca;
    }

    /**
     * Construtor para criação antes de inserir na base de dados
     */
    public Guerreiro(String nome, int vida, int forca) {
        super(nome, vida);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    /**
     * Método específico do Guerreiro
     * Não será usado no sistema, apenas para formalização
     * 
     * @return valor da força
     */
    public int atacar() {
        return forca;
    }
}
