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
	var idpra_bearbeiten;
	
	$scope.stelleLoeschen = function(idpra) {
		
		//$http.delete();
		idpra_loeschen = idpra;
		
	}
	
	$scope.stellendatenHolen = function(idpra) {
		
		console.log(idpra);
		
		idpra_bearbeiten = idpra;
		
		for(var i = 0; i < stellen.length; i++) {
			
			if(stellen[i].id_pra === idpra){
				
				$scope.was = stellen[i].titel;
				$scope.studiengaenge = stellen[i].studiengang;
				$scope.link = stellen[i].link;
				$scope.stadt = stellen[i].stadt;
				$scope.bundesland = stellen[i].bundesland;
				$scope.beschreibung = stellen[i].beschreibung;
				$("#datumangebot").val(stellen[i].datum);				
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
		
		var daten = {};
		
		daten["titel"] = $scope.was;
		daten["link"] = $scope.link;
		daten["studiengang"] = $("#selectstudiangebot").val();;
		daten["beschreibung"] = $scope.beschreibung;
		daten["stadt"] = $scope.stadt;
		daten["bundesland"] = $scope.bundesland;
		daten["datum"] = $("#selectdauerangebot").val();
		daten["dauer"] = $("#datumangebot").val();
		
		console.log(daten);
		
		$http.put(host + "/stelleBearbeiten/" + idpra_bearbeiten, daten).then(function(data) {
			
			console.log(data.data);
			
			location.reload();
			
		});
	}
		
	
});


$(document).ready(function() {

	angular.bootstrap(document.getElementById("profilBody"), ['profil']);

});