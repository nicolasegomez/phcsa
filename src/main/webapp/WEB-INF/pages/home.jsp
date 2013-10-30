<html>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.0-rc.3/angular.min.js"></script>
<script type="text/javascript" src="js/application.js"></script>
<body>
<div ng-app="App">
  <div ng-controller="Edificios">
    <input type="text" ng-model="idEdificio" size="80"/>
    <button ng-click="buscar()">Buscar</button><br>
   
       <p>Id: {{edificio.idEdificio}}</p>
        <p>Dirección: {{edificio.direccion}}</p>
        
    </div>  
</div>
</body>
</html>