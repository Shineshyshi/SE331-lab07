'use strict';

var shoppingCartControllers = angular.module('shoppingCartControllers', ['shoppingCartServices']);
<<<<<<< HEAD

shoppingCartControllers.controller('showShoppingCartController',
    ['$scope', 'shoppingCartService', '$location', '$rootScope', '$routeParams',
        function ($scope, shoppingCartService, $location, $rootScope, $rootParams) {
            var id = $rootParams.id;
            shoppingCartService.get({id: id}, function (data) {
                $scope.cart = data;
            });

            $scope.$on('$locationChangeStart', function (event) {
                $rootScope.cartUpdateSuccess = false;

            });

            $scope.updateCart = function () {
                shoppingCartService.update({id: id}, $scope.cart, function () {
                    $rootScope.cartUpdateSuccess = true;

                });
            };

            $scope.totalEach = function (index) {

                return $scope.cart.selectedProducts[index].product.totalPrice * $scope.cart.selectedProducts[index].amount;
            };

            $scope.total = function () {
                var total = 0;
                angular.forEach($scope.cart.selectedProducts, function (item) {
                    total += item.amount * item.product.totalPrice;
                });

                return total;
            }
        }]);
=======
shoppingCartControllers.controller('showShoppingCartController',['$scope','shoppingCartService','$location','$rootScope',
'$rootParams',
function ($scope, shoppingCartService, $location, $rootScope, $rootParams){
    var id = $rootParams.id;
    shoppingCartService.get({id:id},function(data){
        $scope.cart = data;
    })
    $scope.$on('$locationChangeStart',function(event){
        $rootScope.cartUpdateSuccess = false;
    });
    $scope.updateCart = function () {
        shoppingCartService.update({id:id},$scope.cart,function(){
            $rootScope.cartUpdateSuccess = true;
        });
    }
    $scope.totalEach = function(index){
        return $scope.cart.selectedProducts[index].product.totalPrice * $scope.cart.selectedProducts[index].amount;
    }
    $scope.total = function(){
        var total = 0;
        angular.forEach($scope.cart.selectedProducts, function(item){
            total += item.amount * item.product.totalPrice;
        })
        return total;
    }
}]);

>>>>>>> dac6c4106f4c1cd60ab2f6483bedc29d6c70dcb5
