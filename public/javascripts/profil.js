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
	
	var idpra_loeschen;
	
	$scope.stelleLoeschen = function(idpra) {
		
		//$http.delete();
		idpra_loeschen = idpra;
		
	}
	
	$scope.ngStelleLoeschen = function() {
		
		$http.delete(host + "/stelleLoeschen/" + idpra_loeschen).then(function(data) {
			
			console.log(data);
			
			location.reload();
		});
		
	}
		
	
});


$(document).ready(function() {

	angular.bootstrap(document.getElementById("profilBody"), ['profil']);

});