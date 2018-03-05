<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<body>
<a href="<c:url value="/songs/new"/>">Add New</a>


<table>
    <th>Name</th>
    <th>Rating</th>
    <th>Actions</th>
    <c:forEach items="${songs}" var="song">
        <tr>
            <td><a href="<c:url value="/songs/${song.id}"/>"><c:out value="${song.title}"/></a></td>
            <td><c:out value="${song.rating}"/></td>
            <td>Delete</td>
        </tr>
    </c:forEach>

</table>


</body>



</html>