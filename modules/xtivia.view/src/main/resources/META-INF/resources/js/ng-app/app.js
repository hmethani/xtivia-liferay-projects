
			
			
			angular.module('myModule1.controllers', []).controller('MyController', function ($scope) {
				$scope.mythings = [ {
					name : "Thing 1"
				}, {
					name : "Thing 2",
				} ];

				$scope.add = function() {
					$scope.mythings.push({name: $scope.newThing.name});
				};

				$scope.remove = function(index) {
					$scope.mythings.splice(index, 1);
				};
			});
			
			angular.module('myModule1', ['myModule1.controllers']);
			angular.bootstrap(document.getElementById('myModule'), ['myModule1']);
			
			
			angular.module('myModule2.controllers',[]).controller('CounterControl',function($scope){
				$scope.counter = 1;

				$scope.decrease = function() {
					if ($scope.counter > 0) {
						$scope.counter--;
					}
				};

				$scope.increase = function(index) {
					if ($scope.counter < 100) {
						$scope.counter++;
					}
				};
			});
			
			angular.module('myModule2', ['myModule2.controllers']);
			angular.bootstrap(document.getElementById('counter'), ['myModule2']);