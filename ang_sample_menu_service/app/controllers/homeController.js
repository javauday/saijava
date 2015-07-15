/**
 * Created by Anvesh on 5/4/2015.
 */
app.controller('homeController', ['$scope','gadgetSvc', function($scope,gadgetSvc) {
    //$scope.data = "welcome conroller called";
    $scope.gadgets = gadgetSvc.getGadgets();
    console.log($scope.gadgets);

}]);