var profil = angular.module('profil', []);

var host = "http://" + window.location.host;

profil.controller('profilCtrl', function($scope,$http) {
	
	console.log("TEST");

	$http({
		  method: 'GET',
		  url: host + "/eigeneStellen"
		  
		}).then(function(data){
			
			console.log(data.data);
			$scope.stellen = data.data;
			
		});
	
	$scope.stelleLoeschen = function(idpra) {
		
		//$http.delete();
		
	}
		
	
});


$(document).ready(function() {

	angular.bootstrap(document.getElementById("profilBody"), ['profil']);

});