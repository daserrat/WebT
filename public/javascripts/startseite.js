var startseite = angular.module('startseite', []);

var email;
var name;
var passwort;
var passwort2;
var host = "http://" + window.location.host;

startseite.controller('registrierungCtrl', function($scope,$http,$location) {
	
	/*$scope.ngWeiter = function() {
		
		email = $scope.email;
		name = $scope.name;
		
	};*/

	$scope.ngWeiter = function() {
		
		email = $scope.email;
		name = $scope.name;
		passwort = $scope.passwort;
		passwortw = $scope.passwortw;
		
		if(passwort === passwortw) {
		
		var daten = {};
		daten["email"] = email;
		daten["name"] = name;
		daten["passwort"] = passwort;
		daten["passwortw"] = passwortw;
		
		$http.post(host + "/registrierung", daten).then(function(data) {
			
			console.log(data);
						
		});
		
		}
		
	}
	
});