var registr = angular.module('registr', []);

var host = "http://" + window.location.host;

console.log("Hat geklappt");

registr.controller('registrierungCtrl', function($scope,$http) {
	
	var email;
	var name;
	var passwort;
	var passwort2;
	
	$scope.ngWeiter = function() {
		
		email = $scope.email;
		name = $scope.name;
		
	};

	$scope.ngWeiter2 = function() {
		
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
		
		$scope.meldung = "Fehler";
		
		$http.post(host + "/registrierung", daten).then(function(data) {
			
				console.log(data);
				var erfolg = data.data.message;
				$scope.meldung = "Hallo " + erfolg;
						
		});
				
		}
		
	}
	
	$scope.ngRedirect = function() {
		
		location.reload();
		
	}
	
});

$(document).ready(function() {

	angular.bootstrap(document.getElementById("modal_registrierung"), ['registr']);
	
	if(document.cookie) {
		
		$("#praktAnbieten").hide();
				
	} else {
		
		$("#praktAnbieten").show();
		
	}
});
