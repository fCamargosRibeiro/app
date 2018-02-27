angular.module("app", []).controller('ManterSistemaCtrl', function ($scope, $http) {
	$scope.msgErro = '';
	$scope.sistemas = [];
	$scope.pesquisar = function() {
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
			$scope.sistemas = response.data;
		}, function errorCallback(response) {
			$scope.msgErro = "Nenhum Sistema foi encontrado. Favor revisar os criterios da sua pesquisa!";
		});
	};

	$scope.limpar = function() {
		$scope.descricao = '';
		$scope.sigla = '';
		$scope.emailAtendimentoSistema = '';
		$scope.sistemas = [];
	};
});