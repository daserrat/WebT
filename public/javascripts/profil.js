var profil = angular.module('profil', []);

var host = "http://" + window.location.host;

profil.controller('profilCtrl', function($scope,$http) {
	
	console.log("TEST");
	
	var stellen;

	$http({
		  method: 'GET',
		  url: host + "/eigeneStellen"
		  
		}).then(function(data){
			
			console.log(data.data);
			$scope.stellen = data.data;
			stellen = data.data;
			
		});
	
	var idpra_loeschen;
	
	$scope.stelleLoeschen = function(idpra) {
		
		//$http.delete();
		idpra_loeschen = idpra;
		
	}
	
	$scope.stellendatenHolen = function(idpra) {
		
		console.log(idpra);
		
		for(var i = 0; i < stellen.length; i++) {
			
			if(stellen[i].id_pra === idpra){
				
				$scope.was = stellen[i].titel;
				
				$scope.studiengaenge = stellen[i].studiengang;
				/*var options;
				options = stellen[i].studiengang.split(",");
				$("#selectstudiangebot :selected").val(options);*/
				
			}
				
		}
		
	}
	
	$scope.ngStelleLoeschen = function() {
		
		$http.delete(host + "/stelleLoeschen/" + idpra_loeschen).then(function(data) {
			
			console.log(data);
			
			location.reload();
		});
		
	}
	
	$scope.ngStelleBearbeiten = function() {
		
		
	}
		
	
});


$(document).ready(function() {

	angular.bootstrap(document.getElementById("profilBody"), ['profil']);

});