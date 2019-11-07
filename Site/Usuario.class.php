<?php  
	require_once "Conexao.class.php";
	Class Usuario{
		private $nomeDeUsuario;
		private $senha;


		public function getNomeDeUsuario(){
	 		return $this->nomeDeUsuario;
	 	}
	  
		public function setNomeDeUsuario($nomeDeUsuario){
		 	$this->nomeDeUsuario = $nomeDeUsuario;
	 	}

	 	public function getSenha(){
	 		return $this->senha;
	 	}
	  
		public function setSenha($senha){
		 	$this->senha = $senha;
	 	}

	 	public function __construct($nomeDeUsuario="",$senha=""){
	 		$this->nomeDeUsuario = $nomeDeUsuario;
	 		$this->senha = $senha;

	 	}

	 	public function inserirUsuario(){
	
		$conexao = new Conexao();
		$cn = $conexao->getInstance();
		
		$stmt = $cn->prepare('INSERT INTO usuario VALUES (:nomeDeUsuario,:senha)');
	    $stmt->bindParam(':nomeDeUsuario', $this->nomeDeUsuario);
		$stmt->bindParam(':senha', $this->senha);
	    $result = $stmt->execute();
		
		if(!$result){
			echo "O usuario não pôde ser inserido, tente novamente";
			exit;
		}
			echo $stmt->rowCount(). " usuário(s) inserido com sucesso";
		}	
	}
?>