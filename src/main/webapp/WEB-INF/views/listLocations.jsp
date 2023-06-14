<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Locations</title>
</head>
<body>
      <h2>Location | All Locations</h2>
      <hr>
      <div>
          ${msg}
      </div>
      <table>
        <thead>
             <tr>
                <th>Id</th>
                <th>Code</th>
                <th>Name</th>
                <th>Type</th>
                <th>Delete</th>
                <th>Update</th>
             </tr>
        </thead>
          <c:forEach var="location" items="${locations}">
          <tbody>  
             <tr>
	                <td>${location.id}</td>
	                <td>${location.code}</td>
	                <td>${location.name}</td>
	                <td>${location.type}</td>
	                <td><a href="delete?id=${location.id}">delete</a></td>
	                <td><a href="update?id=${location.id}">update</a></td>
             </tr>
        </tbody>  
          </c:forEach>
      </table>
</body>
</html>