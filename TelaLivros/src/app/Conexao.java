package app;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	private static final String url = "jdbc:mysql://localhost:3306/ds?useTimezone=true&serverTimezone=UTC";
	private static final String usuario = "root";
	private static final String senha =	"";
	
	
	
	public static Connection conectar() {
		
		Connection conexao = null;
		
		try {
			conexao = DriverManager.getConnection(url,usuario,senha);
			
			if(conexao != null) {
				System.out.println("Conectou!!!");
			}
		}catch (Exception e) {
			
			e.printStackTrace();
			
			
		}
		
		return conexao;
		
	}

}
