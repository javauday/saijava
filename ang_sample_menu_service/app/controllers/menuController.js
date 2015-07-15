/**
 * Created by Anvesh on 5/3/2015.
 */
angular.module('myApp').controller('menuController',['$scope',function($scope) {

    function init(){

        $scope.menupageUrl="app/templates/menu.html";

        $scope.menu={
            brand:"mythri",
            menulist:[

                {name:"home",url:'/home'},
                {name:"products",url:'/products'},
                {name:"aboutus",url:'/aboutus'},
                {name:"contactus",url:'/contactus'},
                {name:"directive",url:'/directive'}
            ]
        }

    }init();


}]);