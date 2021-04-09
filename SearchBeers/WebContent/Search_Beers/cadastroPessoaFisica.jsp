<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>SearchBeers - Cadastro</title>
<jsp:useBean id="usuario" class="modelo.Usuario"></jsp:useBean>
<jsp:useBean id="dao" class="dao.DaoUsuario"></jsp:useBean>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="imagens/logo.png">
<link rel="stylesheet" type="text/css" href="css/estilo.css">
<meta charset="UTF-8">
</head>
<body>
	<div id="area-cabecalho">
		<div class="area-principal">
			<form class="form" action="../Autenticacao" method="post">
				<div class="card">
					<a href="../Autenticacao"><img src="imagens/inicio.png" alt=""
						width="30" height="30"></a>

					<div class="card-top">
						<img class="img-login" src="imagens/usuario.png" alt="" />
						<p>
							<b>Crie sua conta</b>
						</p>
					</div>

					<div class="card-group">
						<label for="login">Nome:</label> <input class="form-control"
							type="text" name="login" id="login">
					</div>

					<div class="card-group">
						<label for="senha">Senha:</label> <input class="form-control"
							type="password" name="senha" id="senha">
					</div>

					<div class="card-group">
						<label for="login">CPF:</label> 
						<input type="text" class="form-control" onkeypress="$(this).mask('000.000.000-00');">
					</div>

					<div class="form-group">
						<label>Gênero</label>
						<select class="form-control" name="genero">
						<option value="masc">Masculino</option>
						<option value="femi">Feminino</option>
						<option value="nd">Não declarar</option>
						</select>
					</div>

					<div class="container">
						<button type="button" class="btnCadastrar">Cadastrar</button>
					</div>

					<a href="cadastroFornecedor.jsp" class="tpFornecedor">Criar uma conta de Pessoa Fornecedor?</a>
<!-- 					
					<div class="dropdown">
						<button class="btn btn-outline-light btn-lg dropdown-toggle"
							type="button" id="dropdownMenu2" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false">Gênero</button>
						<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
							<button class="dropdown-item" type="button">Masculino</button>
							<button class="dropdown-item" type="button">Feminino</button>
							<button class="dropdown-item" type="button">Não
								declarar</button>
						</div>
					</div> -->


					<!-- 
					<div class="btnTpAcesso">
						<button type="button" class="btn" data-toggle="modal"
							data-target="#modalPF">Pessoa Física</button>
						<button type="button" class="btn" data-toggle="modal"
							data-target="#modalPJ">Pessoa Jurídica</button>
					</div>

					<div class="container">
						<button type="button" class="btnCadastrar">Cadastrar</button>
					</div>


				</div>
			</form>

			INICIO MODAL -  PESSOA FÍSICA 
			<div class="modal" id="modalPF" tabindex="-1" role="dialog"
				aria-hidden="true">
				<div class="modal-dialog modal-lg modal-dialog-centered"
					role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title">Tipo de acesso</h5>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span id="close" aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body">
							<div class="card-group">
								<label for="cpf">CPF:</label> <input class="form-control"
									type="number" name="cpf" placeholder="Informe o seu CPF">
							</div>
							<div class="card-group">
								<label for="cpf">Telefone:</label> <input class="form-control"
									type="number" name="cpf" placeholder="Informe o seu telefone">
							</div>

							<div class="card-group">
								<label for="senha">Data de nascimento:</label> <input
									class="form-control" type="password" name="senha" id="senha"
									placeholder="Informe a sua data de nascimento">
							</div>
							<div class="dropdown">
								<button class="btn btn-outline-light btn-lg dropdown-toggle"
									type="button" id="dropdownMenu2" data-toggle="dropdown"
									aria-haspopup="true" aria-expanded="false">Gênero</button>
								<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
									<button class="dropdown-item" type="button">Masculino</button>
									<button class="dropdown-item" type="button">Feminino</button>
									<button class="dropdown-item" type="button">Não
										declarar</button>
								</div>
							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-outline-light">Salvar</button>
							<button type="button" class="btn btn-outline-light"
								data-dismiss="modal">Cancelar</button>
						</div>
					</div>
				</div>
			</div>
			
			INICIO MODAL -  PESSOA JURÍDICA 
			<div class="modal" id="modalPJ" tabindex="-1" role="dialog"
				aria-hidden="true">
				<div class="modal-dialog modal-lg modal-dialog-centered"
					role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title">Tipo de acesso</h5>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span id="close" aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body">
							<div class="card-group">
								<label for="cpf">CNPJ:</label> <input class="form-control"
									type="number" name="cpf" placeholder="Informe o seu CPF">
							</div>
							<div class="card-group">
								<label for="cpf">Telefone:</label> <input class="form-control"
									type="number" name="cpf" placeholder="Informe o seu telefone">
							</div>

							<div class="card-group">
								<label for="senha">Nome Fantasia:</label> <input
									class="form-control" type="text" name="senha" id="senha"
									placeholder="Informe a sua data de nascimento">
							</div>
							<div class="card-group">
								<label for="senha">Razão Social:</label> <input
									class="form-control" type="text" name="senha" id="senha"
									placeholder="Informe a sua data de nascimento">
							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-outline-light">Salvar</button>
							<button type="button" class="btn btn-outline-light"
								data-dismiss="modal">Cancelar</button>
						</div>
					</div>
				</div>
			</div>
			-->
		<script>
			$('.dropdown-toggle').dropdown();

		</script>
		</div>
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.min.js">
		</script>
</body>
</html>