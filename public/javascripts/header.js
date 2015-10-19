var header = angular.module('header', []);

angular.module('header', []).controller('loginCtrl', function($scope,$http) {

$(document).ready(function() {
	
	if(document.cookie) {
		
		var cookieSplit = document.cookie.split("=");
		var cookieEmail = cookieSplit[1];
		
		$("#login").html("Eingeloggt als: " + cookieEmail);
		
		$("#login-dp").hide();
		//$("#eingeloggt").show();
				
	} else {
		
		$("#eingeloggt").hide();
		$("#upload").attr("href", "/nichtangemeldet");
		//$("#login-dp").show();
		
	}
	
});

$scope.anmelden = function() {
	
	var email = $scope.email;
	var passwort = $scope.passwort;
	
	var daten = {};
	daten["email"] = email;
	daten["passwort"] = passwort;
	
	$http.post(host + "/login", daten).then(function(data) {
		
		if(data.data.status === "ok") {
			
			location.reload();
			
		} else {
			
			$scope.fehler = data.data.message;
			
		}
		
		/*console.log(data);
		var erfolg = data.data.message;
		$scope.meldung = "Hallo " + erfolg;*/
				
});
	
}

$scope.logout = function() {
		
	$http.post(host + "/logout", {}).then(function(data) {
		
		location.reload();
		
	});
	
}
	

});


