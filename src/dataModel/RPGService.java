package dataModel;

import exceptions.*;
import persistence.PersonagemDAO;
import persistence.GrupoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe de serviço do sistema.
 *
 * Esta classe faz a ligação entre presentation e a camada persistence (DAO).
 *
 * São feitas validações antes de enviar os dados para a BD.
 */
public class RPGService {

    private PersonagemDAO personagemDAO;
    private GrupoDAO grupoDAO;

    /**
     * Construtor da classe RPGService.
     * Inicializa os DAOs utilizados pelo sistema.
     */
    public RPGService() {
        personagemDAO = new PersonagemDAO();
        grupoDAO = new GrupoDAO();
    }

    // ========== PersonagemDAO ==========

    /**
     * Cria um novo personagem.
     *
     * @param nome nome do personagem
     * @param vidaTexto valor da vida em formato String
     * @param tipo tipo do personagem (GUERREIRO, MAGO ou CLERIGO)
     * @param atributoTexto atributo específico do personagem (força, magia ou fé)
     * @throws PersonagemCriarException caso erro na criação
     */
    public void criarPersonagem(String nome, String vidaTexto, String tipo, String atributoTexto) throws SQLException, PersonagemCriarException {

        if (nome.isEmpty()) {
            throw new PersonagemCriarException("Nome não pode estar vazio.");
        }
        int vida = Integer.parseInt(vidaTexto);
        int atributo = Integer.parseInt(atributoTexto);
        Personagem personagem;

        if (tipo.equals("GUERREIRO")) {
            personagem = new Guerreiro(nome, vida, atributo);

        } else if (tipo.equals("MAGO")) {
            personagem = new Mago(nome, vida, atributo);

        } else {
            personagem = new Clerigo(nome, vida, atributo);
        }
        personagemDAO.inserir(personagem);
    }

    /**
     * Lista todos os personagens existentes na base de dados.
     *
     * @return lista contendo todos os personagens
     * @throws SQLException caso ocorra erro na consultar a BD
     */
    public ArrayList<Personagem> listarPersonagens() throws SQLException {
        return personagemDAO.listar();
    }

    /**
     * Remove um personagem da base de dados.
     *
     * @param idTexto id do personagem em formato String
     * @throws Exception caso ocorra erro na conversão ou remoção
     */
    public void removerPersonagem(String idTexto) throws Exception {
        int id = Integer.parseInt(idTexto);
        personagemDAO.remover(id);
    }

    /**
     * Atualiza os dados básicos de um personagem.
     * Noeste projeto apenas o nome e a vida são atualizados.
     *
     * @param idTexto id do personagem em formato String
     * @param nome novo nome do personagem
     * @param vidaTexto nova vida do personagem em formato String
     * @throws Exception caso ocorra erro na conversão ou atualização
     */
    public void atualizarPersonagem(String idTexto, String nome, String vidaTexto) throws Exception {
        int id = Integer.parseInt(idTexto);
        int vida = Integer.parseInt(vidaTexto);

        Personagem personagem = new Guerreiro(id, nome, vida, 1, 1, 1);
        personagemDAO.atualizar(personagem);
    }

    // ========== GrupoDAO ================

    /**
     * Cria um novo grupo de personagens.
     *
     * @param nome nome do grupo
     * @throws GrupoCriarException caso o nome esteja vazio ou ocorra erro na inserção
     */
    public void criarGrupo(String nome) throws Exception, GrupoCriarException {
        if (nome.isEmpty()) {
            throw new GrupoCriarException("Nome do grupo não pode estar vazio.");
        }

        Grupo grupo = new Grupo(nome);
        grupoDAO.inserir(grupo);
    }

    /**
     * Lista todos os grupos registados na base de dados.
     *
     * @return lista de grupos
     * @throws SQLException caso ocorra erro na consulta
     */
    public ArrayList<Grupo> listarGrupos() throws SQLException {
        return grupoDAO.listar();
    }

    /**
     * Adiciona um personagem a um grupo.
     *
     * O método procura o grupo e o personagem pelo nome e depois cria a associação na tabela grupo_personagem.
     *
     * @param nomeGrupo nome do grupo
     * @param nomePersonagem nome do personagem
     * @throws Exception caso o grupo ou personagem não sejam encontrados
     */
    public void adicionarPersonagemAoGrupo(String nomeGrupo, String nomePersonagem) throws Exception {
        // valor inicial de controlo (grupo ou personagem ainda nao foi encontrado)
        int grupoId = -1;
        int personagemId = -1;

        for (Grupo g : listarGrupos()) {
            if (g.getNome().equals(nomeGrupo)) {
                grupoId = g.getId();
            }
        }
        for (Personagem p : listarPersonagens()) {
            if (p.getNome().equals(nomePersonagem)) {
                personagemId = p.getId();
            }
        }

        if (grupoId == -1 || personagemId == -1) {
            throw new Exception("Grupo ou personagem não encontrado.");
        }
        grupoDAO.adicionarPersonagem(grupoId, personagemId);
    }

    /**
     * Lista todos os personagens pertencentes a um grupo.
     *
     * @param grupoId id do grupo
     * @return lista de personagens que pertencem ao grupo
     * @throws SQLException caso ocorra erro na consulta
     */
    public ArrayList<Personagem> listarMembrosDoGrupo(int grupoId) throws SQLException {
        return grupoDAO.listarMembros(grupoId);
    }
    
    /**
    * Remove um grupo a partir do nome.
    *
    * @param nomeGrupo nome do grupo
    * @throws Exception caso o grupo não seja encontrado
    */
    public void removerGrupo(String nomeGrupo) throws Exception {
        for (Grupo g : listarGrupos()) {
            if (g.getNome().equals(nomeGrupo)) {
                grupoDAO.remover(g.getId());
                return;
            }
        }
        throw new Exception("Grupo não encontrado.");
    }
}