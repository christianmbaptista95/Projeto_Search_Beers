package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import banco.Conexao;

import modelo.Fisica;

public class DaoFisica {

	private Connection con;
	private Conexao conexao;

	public DaoFisica() {

		this.conexao = Conexao.getInstancia();
		this.con = this.conexao.conecta();
	}

	// Insere um registro no banco de dados
	public void insert(Fisica fisica) {
		String sql = "INSERT INTO fisica (nome,cpf,data_nascimento,genero,telefone,usuario_id) VALUES (?,?,?,?,?,?) ";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, fisica.getNome());
			stmt.setString(2, fisica.getCpf());
			stmt.setString(3, fisica.getData_nascimento());
			stmt.setString(4, fisica.getGenero());
			stmt.setString(5, fisica.getTelefone());
			stmt.setInt(6, fisica.getUsuario_id());

			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			System.out.println("Falha na inclusão do registro.");
			System.out.println(e.getMessage());
		}
	}

}
