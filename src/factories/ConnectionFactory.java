package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	/*
	 * Método para retornar uma conexão com o banco de dados
	 * do PostGreSQL que esta sendo executado pelo DOCKER
	 */
	public Connection obterConexao() {
		try {
			
			var host = "jdbc:postgresql://localhost:5434/projetoAula03";
			var user = "postgresuser";
			var pass = "postgrespassword";
			
			return DriverManager.getConnection(host, user, pass);
		}
		catch(Exception e) {
			System.out.println("\nErro ao conectar com o banco de dados: " + e.getMessage());
			return null;
		}
	}
}
