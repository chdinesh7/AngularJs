var ro=angular.module('loginApp', ['ngRoute']);
ro.config(function($routeProvider) {
    $routeProvider  
      .when('/main', {
       templateUrl : 'main.html'
    });
});
ro.controller('loginCtrl', ['$scope', function($scope,$location) { 
	
    $scope.myFunction = function() { 
    	var u = $scope.user;
    	var p = $scope.pass; 
    	 if($scope.user == "dinesh" && $scope.pass == "1234" ) {
    		 window.location.assign("main.html")
    		 //$location.assign("main.html");
    	 } 	
    	    
       /* if($scope.user == 'admin' && $scope.pass == '1234'){  
    	        }*/
      
       
    };
}]);