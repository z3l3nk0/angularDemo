/**
 * 
 */
app.factory('greeting', ['$http', function($http) {
	
	return $http.get('hello/greeting/')
				.success(function(data) {
					return data;
				})
				.error(function(err) {
					return err;
				});
					
}]);