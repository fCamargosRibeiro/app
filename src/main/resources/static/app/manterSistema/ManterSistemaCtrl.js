angular.module("app", []).controller('ManterSistemaCtrl', function ($scope, $http) {
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
			$scope.sistemas = response.data;
		}, function errorCallback(response) {
			$scope.msgErro = "Nenhum Sistema foi encontrado. Favor revisar os criterios da sua pesquisa!";
		});
	};

	$scope.voltar = function() {
		$location.path('/')
	};
});