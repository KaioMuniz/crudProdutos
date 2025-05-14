package repositories;

import entities.Produto;
import factories.ConnectionFactory;

public class ProdutoRepository {

	//atributo para utilizarmos a classe de fábrica de conexões
	private ConnectionFactory connectionFactory = new ConnectionFactory();
	
	//método para salvar um produto
	public void inserir(Produto produto) {
		try {
			
			//abrir conexão com o banco de dados
			var connection = connectionFactory.obterConexao();
			
			//executar um comando SQL para inserir o produto no banco de dados
			var statement = connection.prepareStatement("insert into produto(id, nome, preco, quantidade) values(?,?,?,?)");
			statement.setObject(1, produto.getId());
			statement.setString(2, produto.getNome());
			statement.setDouble(3, produto.getPreco());
			statement.setInt(4, produto.getQuantidade());
			statement.execute();
			
			//fechando a conexão
			connection.close();
			
			System.out.println("\nProduto inserido com sucesso!");
		}
		catch(Exception e) {
			System.out.println("\nFalha ao inserir produto: " + e.getMessage());
		}
	}
}
