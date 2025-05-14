package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Produto;
import repositories.ProdutoRepository;

public class ProdutoController {

	//atributo
	private Scanner scanner = new Scanner(System.in);
	
	/*
	 * Método para capturar os dados de um produto
	 * informado pelo usuário e envia-lo para o 
	 * repositório gravar no banco de dados
	 */
	public void cadastrarProduto() {
		
		var produto = new Produto(); //criando objeto da classe Produto
		
		produto.setId(UUID.randomUUID()); //gerando um id único para o produto
		
		System.out.print("Informe o nome do produto.....: ");
		produto.setNome(scanner.nextLine());
		
		System.out.print("Informe o preço...............: ");
		produto.setPreco(Double.parseDouble(scanner.nextLine()));
		
		System.out.print("Informe a quantidade..........: ");
		produto.setQuantidade(Integer.parseInt(scanner.nextLine()));
		
		//enviando o produto para ser gravado no banco de dados
		var produtoRepository = new ProdutoRepository();
		produtoRepository.inserir(produto);
	}
}
