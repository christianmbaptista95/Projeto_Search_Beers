package modelo;

public class Produto {

	private int id;
	private String nome;
	private String origem;
	private String fabricante;
	private String volume;
	private String teor_alcoolico;
	private String foto;
	private int juridica_id;
	private int juridica_usuario_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getTeor_alcoolico() {
		return teor_alcoolico;
	}

	public void setTeor_alcoolico(String teor_alcoolico) {
		this.teor_alcoolico = teor_alcoolico;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getJuridica_id() {
		return juridica_id;
	}

	public void setJuridica_id(int juridica_id) {
		this.juridica_id = juridica_id;
	}

	public int getJuridica_usuario_id() {
		return juridica_usuario_id;
	}

	public void setJuridica_usuario_id(int juridica_usuario_id) {
		this.juridica_usuario_id = juridica_usuario_id;
	}

}
