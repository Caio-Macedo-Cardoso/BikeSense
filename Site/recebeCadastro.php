<?php
require_once "Usuario.class.php";
	$nomeDeUsuario = $_POST["nomeDeUsuario"];
	$confirmaNomeDeUsuario = $_POST["confirmaNomeDeUsuario"];
	$senha = $_POST["senha"];
	$confirmaSenha = $_POST["confirmaSenha"];

	$novoUsuario = new Usuario($nomeDeUsuario, $senha);
				$novoUsuario->inserirUsuario();

	header("Location:login.php");
?>