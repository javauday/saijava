/**
 * Created by Anvesh on 5/3/2015.
 */
angular.module('myApp').controller('gadgetsController',['$scope','gadgetSvc',function($scope,gadgetSvc){


function init() {
    gadgetSvc.getGadgets().then(function(response){
        $scope.gadgets = response;
    })
    //console.log($scope.gadgets);
    $scope.gadget = {};

    $scope.showaddgadget = function () {

        $scope.add = true;
    }
    $scope.addGadget = function () {
        var item = $scope.gadget;
        gadgetSvc.addGadget(item);
    }

}init();




   /* $scope.gadgets=[

        {image:"app/images/iphone.jpg",device:"iphone",company:"apple",cost:"700"},
        {image:"app/images/ipad.png",device:"ipad",company:"apple",cost:"500"},
        {image:"app/images/ipod.jpg",device:"ipod",company:"apple",cost:"200"}


    ];*/


}]);