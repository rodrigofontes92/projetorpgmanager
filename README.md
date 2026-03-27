
# RPG Manager — Gestor de Personagens de RPG

## Descrição do problema

Este projeto consiste no desenvolvimento de uma aplicação em Java para gestão de personagens e grupos em um cenário de RPG (Role Playing Game).

O sistema permite criar, editar, listar e remover personagens de diferentes classes (Guerreiro, Mago e Clérigo), bem como organizar esses personagens em grupos de aventura.

A aplicação utiliza uma interface gráfica em Java Swing para interação com o utilizador e uma base de dados MySQL para persistência dos dados.

O objetivo principal do sistema é simular a organização de personagens e grupos típicos de jogos de RPG, permitindo ao utilizador gerir facilmente os seus personagens e as equipas às quais pertencem.

## Funcionalidades

### Gestão de Personagens
O sistema permite realizar operações CRUD sobre personagens:

- Criar personagem
- Listar personagens
- Atualizar dados de personagem
- Remover personagem

Cada personagem possui:

- ID
- Nome
- Vida
- Experiência
- Nível
- Tipo de personagem
- Atributo específico da classe

#### Tipos de personagem
O sistema suporta três classes:

- Guerreiro - Atributo principal: Força
- Mago - Atributo principal: Magia
- Clérigo - Atributo principal: Fé

A classe base é Personagem, que é abstrata, sendo especializada pelas subclasses:

- Guerreiro
- Mago
- Clerigo

### Gestão de grupos
O sistema permite também gerir grupos de personagens.

Funcionalidades disponíveis:

- Criar grupo
- Listar grupos
- Remover grupo
- Adicionar personagem a grupo
- Listar membros de um grupo

Um grupo pode conter vários personagens e um personagem pode pertencer a vários grupos, sendo a relação implementada através de uma tabela associativa na base de dados.

## Tecnologias utilizadas
- Java
- Java Swing (interface gráfica)
- MySQL Workbench
- JDBC
- NetBeans IDE

## Arquitetura do projeto
O projeto está organizado em camadas, separando responsabilidades.

### Camada de apresentação (presentation)
Responsável pela interface gráfica e interação com o utilizador.

Cada funcionalidade da aplicação é apresentada ao utilizador através de JDialogs específicos.

### Camada de negócio (dataModel)
Contém as classes que representam os objetos principais do sistema.

Exemplos:

- Personagem (classe abstrata)
- Guerreiro
- Mago
- Clerigo
- Grupo
- RPGService

A classe RPGService funciona como intermediária entre a interface e os DAO.

### Camada de persistência (persistence)
Responsável pela comunicação com a base de dados.

Exemplos:
- DBWorker
- PersonagemDAO
- GrupoDAO

Essas classes executam operações SQL como:
- INSERT
- SELECT
- UPDATE
- DELETE

### Tratamento de exceções
O sistema inclui exceções personalizadas para validação de dados:
- PersonagemCriarException
- GrupoCriarException

Essas exceções são usadas para informar erros específicos ao utilizador, como por exemplo:
- Nome vazio
- Dados inválidos

## Base de Dados
A aplicação utiliza MySQL.

Estrutura simplificada:

### Tabela personagem

Armazena os dados de cada personagem.

Campos:
- id
- nome
- vida
- experiencia
- nivel
- tipo
- forca
- magia
- fe

### Tabela grupo

Armazena os grupos criados no sistema.

Campos:
- id
- nome

### Tabela grupo_personagem

Tabela associativa que liga personagens a grupos.

Campos:
- grupo_id
- personagem_id

## Instruções de utilização
#### 1. Executar a aplicação

Abrir o projeto no NetBeans e executar a classe principal FrmMain. Esta classe contém o método main() e abre a janela principal da aplicação.

#### 2. Utilizar o menu principal

A aplicação possui dois menus principais:

#### Menu Personagem

Permite:

- Criar personagem
- Listar personagens
- Atualizar personagem
- Remover personagem

#### Menu Grupo

Permite:

- Criar grupo
- Listar grupos
- Adicionar personagem a grupo
- Listar membros de um grupo
- Remover grupo

#### 3. Interagir com os formulários

Cada funcionalidade abre um JDialog específico, onde o utilizador pode:

- inserir dados
- selecionar personagens
- escolher grupos
- confirmar operações

## Recursos Visuais
O projeto inclui um pacote (images), o qual contém imagens ilustrativas utilizadas na interface gráfica, apresentadas no FrmMain e nos diferentes JDialogs.

Essas imagens ajudam a tornar a interface visualmente mais agradável.

## Considerações importantes
- O projeto segue uma separação clara de responsabilidades, dividindo o sistema em camadas.
- A base de dados é acessada através de JDBC.
- As operações SQL são executadas através das classes DAO.
- A interface gráfica foi desenvolvida com Java Swing.
- A relação entre grupos e personagens é implementada através de uma tabela associativa, representando um relacionamento muitos-para-muitos.