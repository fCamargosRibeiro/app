//Criacao do modulo principal da aplicacao
var appSistema = angular.module("appSistema", [ 'ngRoute',
		'angularUtils.directives.dirPagination', 'ngMaterial' ]);

appSistema.config(function($routeProvider, $locationProvider) {

	$routeProvider.when("/sistemas", {
		templateUrl : 'view/sistema.html',
		controller : 'sistemaController'
	}).when("/manterSistema", {
		templateUrl : 'view/manterSistema.html',
		controller : 'manterSistemaController'
	}).otherwise({
		rediretTo : '/'
	});

	$locationProvider.html5Mode({
		enabled : true,
		requireBase : false
	});
});
