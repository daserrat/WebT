/**
 * 
 */
var suche = angular.module('suche', []);
var host = "http://" + window.location.host;
suche.controller('suchenCtrl', function($scope,$http) {
	
	
	$scope.ngSuchen = function(){
				
		var bundesland = $scope.bundesland;
		var studiengang = $scope.studiengang;
		var dauer = $scope.dauer;
		
		console.log(bundesland, studiengang, dauer);
		
		$http.get(host + "/sucheStellen?bundesland=" + bundesland + 
				"&studiengang=" + studiengang + 
				"&dauer="+ dauer).then(function(data) {
			
			if(data.data.status === "ok") {
				
				//location.href = location.href + "?erfolg";

				console.log(data);
			}
					
		});
	}
	
});
$(document).ready(function() {

	angular.bootstrap(document.getElementById("sucheDiv"), ['suche']);

});