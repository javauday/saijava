/**
 * Created by Anvesh on 5/2/2015.
 */
var app = angular.module('myApp',['ui.router']);
app.config(function($stateProvider,$urlRouterProvider) {
 $urlRouterProvider.otherwise("/");
 $stateProvider
     .state('home', {
      url: "/",
      templateUrl: "app/templates/home.html",
         controller:'welcomeController'
     })

     .state('products', {
      url: '/products',
      templateUrl: "app/templates/gadgets.html",
         controller:'gadgetsController'
     })
     .state('aboutus', {
      url: "/aboutus",
      templateUrl: "app/templates/aboutus.html"
     })
     .state('contactus', {
         url: "/contactus",
         templateUrl: "app/templates/register.html",
         controller:"registerController"
     })
     .state('directive', {
         url: "/directive",
         templateUrl: "app/templates/directive.html",
         controller:"directiveController"
     })
});


















