<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prueba</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>Productos</h2>
			<hr />
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Lista de Productos</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							<th>id</th>
							<th></th>
						</tr>

						<!-- Iterar sobre el atributo del modelo candidatos -->
						<c:forEach var="categoria" items="${categoria.producto}">
							<tr>
								<td>Producto ${categoria.producto.nombre}</td>
							</tr>
						</c:forEach>

					</table>

				</div>
			</div>
		</div>

	</div>

</body>
</html>