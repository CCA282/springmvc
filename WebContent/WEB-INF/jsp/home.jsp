<%@ page contentType="text/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
	<title>Equipe société CASTRO</title>
</head>

<body>

	<h2>Ils vont vous faire aimer le Chocolat :</h2>
	
<ul>
		<c:forEach items="${employes}" var="employe">
			<li>
				<c:out value="${employe.nom}" />
				<c:out value="${employe.prenom}" />
				<c:out value="${employe.email}" />
			</li>
		</c:forEach>
</ul>

</body>

</html>