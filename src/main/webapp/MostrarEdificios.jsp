<!DOCTYPE html>
<html>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.arco.phcsa.dominio.Edificio"%>
<%@page import="java.util.List"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostrar Edificios</title>
</head>
<body>
	Hola Edificios
	</br>
	<%
	List<Edificio> listaDeEdificios = (List<Edificio>)request.getAttribute("edificios");
	for(Edificio edificio:listaDeEdificios){
	  %>
	<%=edificio.getIdEdificio()%>
	<%=edificio.getDireccion()%>
	</br>
	<%} %> 
</body>
</html>






