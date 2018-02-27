var app = angular.module("app", ['ngRoute', 'angularUtils.directives.dirPagination', '$http']);

app.config(['$routeProvider',function ($routeProvider, $locationProvider) {
    
    $routeProvider
    .when('/sistemas',{
        templateUrl: 'app/manterSistemaistema/views/manterSistema.html',
        controller : 'SistemaCtrl'
    })    
    .otherwise({redirectTo: '/'});
    
    $locationProvider.html5Mode(true);
}]);
