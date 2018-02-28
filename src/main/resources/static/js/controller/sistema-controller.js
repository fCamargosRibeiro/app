//Criacao de controllers
appSistema.controller ("sistemaController", function  ($scope, $location, $http){
	$scope.msgErro = '';
	$scope.sistemas = [];
	$scope.pesquisar = function() {
		$scope.msgErro = '';
		$scope.sistemas = [];
		$http({
			method : 'GET',
			url : '/sistemasFiltro',
			params : {
				"descricao" : $scope.descricao,
				"sigla" : $scope.sigla,
				"emailAtendimentoSistema" : $scope.emailAtendimentoSistema
			},
			headers : {
				"Content-Type" : "application/json"
			},
		}).then(function successCallback(response) {
			if(response.data.length > 0){
				$scope.sistemas = response.data;
			}else{
				$scope.msgErro = "Nenhum Sistema foi encontrado. Favor revisar os criterios da sua pesquisa!";
			}
			
		});
	};

	$scope.limpar = function() {
		$scope.msgErro = '';
		$scope.descricao = '';
		$scope.sigla = '';
		$scope.emailAtendimentoSistema = '';
		$scope.sistemas = [];
	};
	
	$scope.cadastrar = function() {
		$location.path("/manterSistema");
	};
});

