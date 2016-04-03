app.controller('GreetingController', ['$scope', 'greeting', function($scope, greeting) { 
	greeting.
    success(function(data) {
        $scope.greetings = data;
    });
	}]);
