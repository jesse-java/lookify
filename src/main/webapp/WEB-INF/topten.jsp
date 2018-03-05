<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h1>Top Ten Songs:</h1>

<a href="<c:url value="/dashboard"/>">Dashboard</a>

<table>
    <th>Name</th>
    <th>Rating</th>
    <c:forEach items="${songs}" var="song">
        <tr>
            <td><a href="<c:url value="/songs/${song.id}"/>"><c:out value="${song.title}"/></a></td>
            <td><c:out value="${song.rating}"/></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>