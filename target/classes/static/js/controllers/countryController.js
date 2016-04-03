
app.controller('CountryController', ['$scope', 'country', function($scope, country) { 
	country.
    success(function(data) {
        $scope.countries = data;
    });
	}]);

app.controller('CountryDetailController', ['$scope', 'country', '$routeParams', function($scope, country, $routeParams) {
	country.success(function(data) {
	    $scope.country = data[$routeParams.id];
	  });
	}]);

