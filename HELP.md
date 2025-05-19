# CRUD Produtos

Projeto Java local para gerenciamento de produtos com operações de CRUD (Create, Read, Update, Delete) utilizando **JDBC** e **PostgreSQL**. O banco de dados é executado em um contêiner Docker definido no arquivo `docker-compose.yml`.

## 🛠 Tecnologias Utilizadas

- **Java 21**  
  Linguagem de programação principal.  
  [Documentação Java](https://docs.oracle.com/en/java/)

- **JDBC (Java Database Connectivity)**  
  API Java para conexão com bancos de dados relacionais.  
  [Documentação JDBC](https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/)

- **PostgreSQL**  
  Banco de dados relacional utilizado para armazenar os dados dos produtos.  
  [Site oficial PostgreSQL](https://www.postgresql.org/)

- **Docker + Docker Compose**  
  Utilizado para criar e gerenciar o contêiner do banco de dados PostgreSQL.  
  [Documentação Docker](https://docs.docker.com/)  
  [Documentação Docker Compose](https://docs.docker.com/compose/)

## 📦 Camadas do Projeto

### Entities
Contêm as classes de modelo, como `Produto`, que representam as tabelas do banco de dados.

### Controllers
Responsáveis por intermediar as requisições do usuário e as operações do repositório. Exemplo: `ProdutoController` valida e direciona as ações do CRUD.

### Repositories
Implementam o acesso direto ao banco de dados utilizando **JDBC**, como `ProdutoRepository`, que realiza as operações SQL.

### Factories
Contêm classes auxiliares, como `ConnectionFactory`, que gerencia a criação de conexões com o PostgreSQL.
