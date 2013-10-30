angular.module('App', []);

function Edificios($scope, $http, $templateCache) {
    
  $scope.buscar = function() {
    
      $http({method: "GET", url: "/phcsa/edificios/get?id="+$scope.idEdificio, cache: $templateCache}).
      success(function(data, status) {
        $scope.edificio = data;
      }).
      error(function(data, status) {
        $scope.data = data || "Request failed";
    });
  };
}