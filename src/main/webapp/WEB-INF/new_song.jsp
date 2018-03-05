<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<form:form method="POST" action="/songs/new" modelAttribute="song">
    <fieldset>
        <legend>Create a song:</legend>
        <form:label path="title">Title
            <form:errors path="title"/>
            <form:input path="title"/>
        </form:label>

        <form:label path="artist">Artist
            <form:errors path="artist"/>
            <form:input path="artist"/>
        </form:label>

        <form:label path="rating">Rating (1-10)
            <form:errors path="rating"/>
            <form:input path="rating"/>
        </form:label>

        <input type="submit" value="Add Song">
    </fieldset>
</form:form>
</body>
</html>