<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<a href="<c:url value="/dashboard"/>">Dashboard</a>

<h1>Title: <c:out value="${song.title}"/></h1>
<h1>Artist: <c:out value="${song.artist}"/></h1>
<h1>Rating: <c:out value="${song.rating}"/></h1>

<a href="<c:url value="/songs/delete/${song.id}"/>">Delete</a>
</body>
</html>