/**
 * 
 */

app.directive('greeting', function() {
	return {
		restrict: 'E',
		scope: {
			greeting: '='
		},
		templateUrl: 'js/directives/greeting.html'
	};
});

