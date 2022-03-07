package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LivrosDAO {
	
	Connection conexao;
	PreparedStatement statement;
	
	public void inserir (Livros livros) {
		
		conexao = Conexao.conectar();
		
		String sql = "INSERT INTO livros(titulo,autor,ano,pagina) VALUES (?,?,?,?)";
		
		
		try {
			
			statement = conexao.prepareStatement(sql);
			statement.setString(1, livros.getTitulo());
			statement.setString(2, livros.getAutor());
			statement.setInt(3, livros.getAno());
			statement.setInt(4, livros.getPaginas());
			
			statement.executeUpdate();
			conexao.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		
	}
	public List<Livros> selicionarTodos(){
		conexao = Conexao.conectar();
		List<Livros>livros = new ArrayList<>();
		String sql = "SELECT * FROM livros ";
		
		try {
			statement = conexao.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery(sql);
			
			while(resultado.next()) {
				Livros livro = new Livros();
				
				livro.setId(resultado.getInt("ID"));
				livro.setTitulo(resultado.getString("Titulo"));
				livro.setAutor(resultado.getString("Autor"));
				livro.setAno(resultado.getInt("Ano"));
				livro.setPaginas(resultado.getInt("Paginas"));
				
				livros.add(livro);					}
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return livros;
		
	}
	
	public void excluir(int id) {
		conexao = Conexao.conectar();
		String sql = "DELETE * FROM livros WHERE ID=?";
		
		try {
			
			statement = conexao.prepareStatement(sql);
			statement.setInt(1,id);
			
			statement.executeUpdate();
			conexao.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
	}
	
	public void alterar(Livros livros) {
		
		conexao = Conexao.conectar();
		String sql = "UPDATE * FROM livro SET titulo=?, autor=?, ano=?,paginas=? WHERE ID=?";
		
		try {
			
			statement = conexao.prepareStatement(sql);
			statement.setString(1, livros.getTitulo());
			statement.setString(2,livros.getAutor());
			statement.setInt(3, livros.getAno());
			statement.setInt(4, livros.getPaginas());
			statement.setInt(5, livros.getId());
			
			statement.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	

}