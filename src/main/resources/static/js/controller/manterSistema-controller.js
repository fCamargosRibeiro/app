appSistema.controller("manterSistemaController", function($scope, $location, $http, $mdDialog){
	$scope.msgErro = '';
	$scope.sistemas = [];
	$scope.cadastrar = function() {
		$http({
			method : 'POST',
			url : '/sistemas',
			data: {
				"descricao" : $scope.descricao,
				"sigla" : $scope.sigla,
				"emailAtendimentoSistema" : $scope.emailAtendimentoSistema,
				"url" : $scope.url
			},
			headers : {
				"Content-Type" : "application/json"
			},
		}).then(function successCallback(response) {
			$scope.showConfirm();
		}, function errorCallback(response) {
			$scope.msgErro = "Nenhum Sistema foi encontrado. Favor revisar os criterios da sua pesquisa!";
		});
	};

	$scope.voltar = function() {
		$location.path("/sistemas");
	};
	
	$scope.showConfirm = function() {
	    var confirm = $mdDialog.confirm()
	          .title('Cadastro Sistema')
	          .textContent('Operação realizada com sucesso.')
	          .ariaLabel('Lucky day')
	          .ok('OK');

	    $mdDialog.show(confirm).then(function() {
	    	$location.path("/sistemas");
	    });
	};
});