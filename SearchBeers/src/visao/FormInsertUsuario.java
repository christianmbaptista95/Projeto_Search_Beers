package visao;

import modelo.Usuario;
import dao.DaoUsuario;

public class FormInsertUsuario {

	public static void main(String[] args) {
		

		Usuario usuario = new Usuario();
		
		DaoUsuario dao = new DaoUsuario();
		
		usuario.setLogin("administrador");
		usuario.setSenha("admin");
		usuario.setEmail("administrador@searchbeers.com.br");
		usuario.setPerfil("admin");
		
		dao.insert(usuario);
		System.out.println("Registro inserido com sucesso!");
		
	

	}

}
