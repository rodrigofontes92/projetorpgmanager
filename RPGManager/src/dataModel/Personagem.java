package dataModel;

/**
 * Classe abstrata que representa um personagem genérico de RPG
 * Esta classe serve como superclasse para Guerreiro, Mago e Clerigo
 * 
 * Implementa o princípio da herança e encapsulamento
 */
public abstract class Personagem {

    private int id;
    private String nome;
    private int vida;
    private int experiencia;
    private int nivel;

    /**
     * Construtor completo
     * 
     * @param id Identificador do personagem
     * @param nome Nome do personagem
     * @param vida Vida do personagem
     * @param experiencia Experiência (defeito 1)
     * @param nivel Nível (defeito 1)
     */
    public Personagem(int id, String nome, int vida, int experiencia, int nivel) {
        this.id = id;
        this.nome = nome;
        this.vida = vida;
        this.experiencia = experiencia;
        this.nivel = nivel;
    }

    /**
     * Construtor sem id (usado para criação antes de inserir na BD)
     */
    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
        this.experiencia = 1;
        this.nivel = 1;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
