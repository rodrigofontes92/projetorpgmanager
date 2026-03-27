package dataModel;

/**
 * Classe que representa um Mago
 * Herda de Personagem e possui atributo específico magia
 */
public class Mago extends Personagem {

    private int magia;

    /**
     * Construtor completo
     */
    public Mago(int id, String nome, int vida, int experiencia, int nivel, int magia) {
        super(id, nome, vida, experiencia, nivel);
        this.magia = magia;
    }

    /**
     * Construtor para criação antes de inserir na base de dados
     */
    public Mago(String nome, int vida, int magia) {
        super(nome, vida);
        this.magia = magia;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    /**
     * Método específico do Mago
     * Não será usado no sistema, apenas para formalização.
     * 
     * @return valor da magia
     */
    public int lancarMagia() {
        return magia;
    }
}
