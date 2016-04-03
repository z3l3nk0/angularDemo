/**
 * 
 */

app.directive('country', function() {
	return {
		restrict: 'E',
		scope: {
			country: '='
		},
		templateUrl: 'js/directives/country.html'
	};
});

