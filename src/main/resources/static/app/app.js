var app = angular.module("app", ['ngRoute', 'angularUtils.directives.dirPagination', '$http']);

app.config(['$routeProvider',function ($routeProvider, $locationProvider) {
    
    $routeProvider
    .when('/sistemas',{
        templateUrl: 'sistema/views/sistema.html',
        controller : 'SistemaCtrl'
    })
    .when('/manterSistema',{
        templateUrl: 'manterSistema/views/manterSistema.html',
        controller : 'ManterSistemaCtrl'
    })
    
    .otherwise({redirectTo: '/'});
    
    $locationProvider.html5Mode(true);
}]);
