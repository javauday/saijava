app.directive('showHide',[function(){
    return
    {
        restrict = "A",
//controller:'directiveController',

            controller=function($scope)
    {$scope.myname="anvesh";
    },
        link=function(scope,element,attrs){
            console.log(scope);
            var ele =  element.find('button');
            if(ele){
                ele.bind('click',function(){
                    $('#data').html($scope.myname);
                })
            }

        }

    }

}]);