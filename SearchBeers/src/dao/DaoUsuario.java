package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import banco.Conexao;
import modelo.Usuario;




public class DaoUsuario {
	
	private Connection con;
	private Conexao conexao;
	
	public DaoUsuario() {
		this.conexao = Conexao.getInstancia();
		this.con = this.conexao.conecta();
	}
	
	

	//Executa qualquer consulta no banco
	public List<Usuario> executaSelect(String sql) {
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Usuario u = new Usuario();
				u.setId(rs.getInt("id"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
				u.setEmail(rs.getString("email"));
				u.setPerfil(rs.getString("perfil"));
					
				listaUsuarios.add(u);
			}
			
			rs.close();
			stmt.close();
			
			
		}catch (Exception e) {
			System.out.println("Falha na consulta ao banco de dados");
			System.out.println(e.getMessage());
		}
		
		
		
		return listaUsuarios;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
