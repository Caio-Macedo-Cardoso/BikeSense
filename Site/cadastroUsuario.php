<!DOCTYPE html>
<html>
<head>
	<title>BIKESENSE</title>
	<link rel="stylesheet" type="text/css" href="css/estilo.css">
	<link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
</head>
<body>
	
	<div id="barraDeNavegacao">

		<div id="titulo">
			<h1>BIKESENSE</h1>
		</div>
	</div>

	<div id="divisaoImagemCabecalho">
		
		<img src="img/img1.jpg" id="imagemCabecalho">

	</div>

	<div id="divisaoformularioCadastro">
		<form action="recebeCadastro.php" method="post" id="formularioCadastro">
			
			<input type="text" name="nomeDeUsuario" id="entradaTexto" placeholder="Nome de usuário">
			
			<input type="text" name="confirmaNomeDeUsuario" id="entradaTexto" placeholder="Confirmar nome de usuário">

			<input type="password" name="senha" id="entradaTexto" placeholder="Senha">
			
			<input type="password" name="confirmaSenha" id="entradaTexto" placeholder="Confirmar senha">

			<button type="submit" id="botaoEnviar">Entrar</button>
		</form>
	</div>
</body>
</html>