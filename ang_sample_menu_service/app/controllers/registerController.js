/**
 * Created by Anvesh on 5/2/2015.
 */
angular.module('myApp').controller('registerController', ['$scope', function($scope) {
    $scope.register = function(){
       // console.log($scope.user);
       $scope.displaypage=true;
       // $scope.welcomeUrl="app/templates/welcome.html"
        $scope.gadgetsUrl="app/templates/gadgets.html"
    };
    $scope.loadcity = function(){
        console.log($scope.user.city);
       $scope.user.city = $scope.user.state.city;

    };

    function init(){
   $scope.registerpage="app/templates/register.html";

        $scope.user={
            firstName:"",
            password:"",
            email:""

        };
        $scope.displaypage=false;
       $scope.states=[

            {statecode:"ap",name:"andhrapradesh",city:"vijayawada"},
            {statecode:"tg",name:"telangana",city:"hyderabad"}
        ]


    }init();


}]);