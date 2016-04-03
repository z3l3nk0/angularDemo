
app.controller('ReseController', function($scope) {
	$scope.resaBaseTypes = [];
	$scope.resaTopTypes = [];
	$scope.reseTypes = ['Basic', 'Top'];
	$scope.reseBasicTypes = ['Basic', 'Basic Straight', 'Basic Triangle'];
	$scope.reseTopTypes = ['Basic', 'Basic Straight', 'Basic Triangle'];
	$scope.rese = [];
    $scope.master = {firstName:"John", lastName:"Doe"};
    $scope.reset = function() {
    	$scope.rese.push($scope.resa);
    };
    $scope.typeBase = false;
    $scope.setBase = function() {
    	$scope.typeBase = !$scope.typeBase;
    };
    
    $scope.typeTop = false;
    $scope.setTop = function() {
    	$scope.typeTop = !$scope.typeTop;
    };
});
