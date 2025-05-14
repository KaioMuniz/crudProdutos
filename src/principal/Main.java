package principal;

import controllers.ProdutoController;

public class Main {

	public static void main(String[] args) {

		//criando um objeto da classe de controle
		var produtoController = new ProdutoController();

		//executando o cadastro do produto
		produtoController.cadastrarProduto();
	}
}
