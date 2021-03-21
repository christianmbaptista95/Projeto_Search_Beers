package visao;

import dao.DaoJuridica;
import modelo.Juridica;

public class FormInsertJuridica {

	public static void main(String[] args) {

		Juridica juridica = new Juridica();

		DaoJuridica dao = new DaoJuridica();

		juridica.setRazao_social("SearchBeers");
		juridica.setNome_fantasia("SearchBeers");
		juridica.setCnpj("1321541654561");
		juridica.setUsuario_id(1);

		dao.insert(juridica);

		System.out.println("Registro inserido com sucesso!");

	}

}
