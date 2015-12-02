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
	
	var cookieSplit = document.cookie.split("=");
	var cookieEmail = cookieSplit[1];
	
	$scope.aktEmail = cookieEmail;
	
	var idpra_loeschen;
	var idpra_bearbeiten;
	
	$scope.updateEmail = function() {
		
		var neueEmail = {};
		
		if($scope.neueEmail === $scope.neueEmailW) {
			
			neueEmail["email"] = $scope.neueEmail;
			neueEmail["aktPasswort"] = $scope.aktPasswort1;
		
			$http.put(host + "/emailBearbeiten", neueEmail).then(function(data){
				
				if(data.data.status === "ok") {
				
					console.log(data.data);
					
					location.reload();
					
				} else {
					
					$scope.falscheEingabeMail = "Passwort falsch"
					
				}
				
			});
		
		} else {
			
			$scope.falscheEingabeMail = "E-Mail nicht gleich"
			
		}
				
		
	}
	
	$scope.updatePasswort = function() {
		
		var neuesPasswort = {};
		
		if($scope.neuesPasswort === $scope.neuesPasswortw) {
			
			neuesPasswort["passwort"] = $scope.neuesPasswort;
			neuesPasswort["aktPasswort"] = $scope.aktPasswort2;
		
			$http.put(host + "/passwortBearbeiten", neuesPasswort).then(function(data){
				
				if(data.data.status === "ok") {
				
					console.log(data.data);
					
					location.reload();
					
				} else {
					
					$scope.falscheEingabePasswort = "Passwort falsch"
					
				}
				
			});
			
		} else {
			
			$scope.falscheEingabePasswort = "Passwörter nicht gleich"
			
		}
		
		
	}
	
	$scope.stelleLoeschen = function(idpra) {
		
		//$http.delete();
		idpra_loeschen = idpra;
		
	}
	
	$scope.stellendatenHolen = function(idpra) {
		
		console.log(idpra);
		
		idpra_bearbeiten = idpra;
		
		var stgangarray = [];
		
		for(var i = 0; i < stellen.length; i++) {
			
			if(stellen[i].id_pra === idpra){
				
				stgangarray = stellen[i].studiengang.split(",");
				
				$scope.was = stellen[i].titel;
				$("#selectstudiangebot").val(stgangarray);
				$scope.link = stellen[i].link;
				$scope.stadt = stellen[i].stadt;				
				$("#bundeslandangebot").val(stellen[i].bundesland);
				$("#selectdauerangebot").val(stellen[i].dauer);
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
	
	var studiengang;
	
	$scope.ngStelleBearbeiten = function() {
		
		var daten = {};
		
		studiengang = $("#selectstudiangebot").val();
		
		daten["titel"] = $scope.was;
		daten["link"] = $scope.link;
		daten["studiengang"] = studiengang;
		daten["beschreibung"] = $scope.beschreibung;
		daten["stadt"] = $scope.stadt;
		daten["bundesland"] = $("#bundeslandangebot").val();
		daten["datum"] = $("#datumangebot").val();
		daten["dauer"] =$("#selectdauerangebot").val();
		
		
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