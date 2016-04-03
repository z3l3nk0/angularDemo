/**
 * 
 */

var app = angular.module('myApp', ['ngRoute']);

app.config(function ($routeProvider) {
  $routeProvider 
    .when('/countries', {  
      templateUrl: 'js/views/countries.html' 
    })
  	.when('/countries/:id', {
  		controller: 'CountryDetailController',
  		templateUrl: 'js/views/country.html'
  	})
  	.when('/rese', {
  		controller: 'ReseController',
  		templateUrl: 'js/views/rese.html'
  	})
    .otherwise({ 
      redirectTo: '/index.html' 
    }); 
});