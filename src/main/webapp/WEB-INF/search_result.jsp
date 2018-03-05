<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<a href="<c:url value="/dashboard"/>">Dashboard</a>


<table>
    <th>Name</th>
    <th>Rating</th>
    <th>Actions</th>
    <c:forEach items="${songs}" var="song">
        <tr>
            <td><a href="<c:url value="/songs/${song.id}"/>"><c:out value="${song.title}"/></a></td>
            <td><c:out value="${song.rating}"/></td>
            <td><a href="<c:url value="/songs/delete/${song.id}"/>">Delete</a></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>