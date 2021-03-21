package visao;

import dao.DaoFisica;
import modelo.Fisica;

public class FormInsertUsuarioFisica {
	
	public static void main(String args[]) {
		
		Fisica fisica = new Fisica();
		
		DaoFisica dao = new DaoFisica();
		
		
		fisica.setNome("Testando teste");
		fisica.setCpf("21654654621");
		fisica.setData_nascimento("21/02/73");
		fisica.setGenero("Masculino");
		fisica.setTelefone("42992166055");
		fisica.setUsuario_id(1);
		
		dao.insert(fisica);
		
		System.out.println("Registro inserido com sucesso!");
		
		
	}

}
