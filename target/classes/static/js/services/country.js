/**
 * 
 */
app.factory('country', ['$http', function($http) {
	
	return $http.get('country/country/')
				.success(function(data) {
					return data;
				})
				.error(function(err) {
					return err;
				});
					
}]);