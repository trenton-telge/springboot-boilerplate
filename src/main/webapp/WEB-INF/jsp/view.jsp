<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    <c:forEach var="x" items="${students}">
        <tr>
            <td>${x.getStid()}</td>
            <td>${x.getFname()}</td>
            <td>${x.getLname()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>