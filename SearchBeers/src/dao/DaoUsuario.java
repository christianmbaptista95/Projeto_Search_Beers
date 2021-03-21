package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import banco.Conexao;

import modelo.Usuario;

public class DaoUsuario {

	private Connection con;
	private Conexao conexao;

	public DaoUsuario() {
		this.conexao = Conexao.getInstancia();
		this.con = this.conexao.conecta();

	}

	// Insere um registro no banco de dados
	public void insert(Usuario usuario) {
		String sql = "INSERT INTO usuario (login,senha,email,perfil) VALUES (?,?,?,?) ";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			stmt.setString(3, usuario.getEmail());
			stmt.setString(4, usuario.getPerfil());

			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			System.out.println("Falha na inclus�o do registro.");
			System.out.println(e.getMessage());
		}
	}
}
