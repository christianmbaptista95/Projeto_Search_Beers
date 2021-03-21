package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import banco.Conexao;

import modelo.Juridica;

public class DaoJuridica {

	private Connection con;
	private Conexao conexao;

	public DaoJuridica() {
		this.conexao = Conexao.getInstancia();
		this.con = this.conexao.conecta();

	}

	// Insere um registro no banco de dados
	public void insert(Juridica juridica) {
		String sql = "INSERT INTO juridica (razao_social,nome_fantasia,cnpj,usuario_id) VALUES (?,?,?,?) ";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, juridica.getRazao_social());
			stmt.setString(2, juridica.getNome_fantasia());
			stmt.setString(3, juridica.getCnpj());
			stmt.setInt(4, juridica.getUsuario_id());

			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			System.out.println("Falha na inclusão do registro.");
			System.out.println(e.getMessage());
		}
	}

}
