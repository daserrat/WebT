var profil = angular.module('profil', []);

var host = "http://" + window.location.host;

profil.controller('profilCtrl', function($scope,$http) {
	
	$http.get(host + "/eigeneStellen").then(function({
		
		
		
	});
	
});


$(document).ready(function() {

	angular.bootstrap(document.getElementById("profilBody"), ['profil']);

});