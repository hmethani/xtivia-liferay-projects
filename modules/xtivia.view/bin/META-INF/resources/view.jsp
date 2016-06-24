<%@ include file="/init.jsp" %>


<div id="myModule" ng-controller="MyController" ng-cloak>
    <h1>My Things</h1>
    <input ng-model="newThing.name"/>
    <button ng-click="add();">Add</button>
    <div ng-repeat="mything in mythings">
        <span>{{mything.name}}</span>
        <button ng-click="remove($index);">Remove</button>
    </div>
</div>

<div id="counter" ng-controller="CounterControl" ng-cloak>
	<h1>Counter</h1>
	<h1><button ng-click="decrease();">&lt;</button>{{counter}}<button ng-click="increase();">&gt;</button></h1>
</div>