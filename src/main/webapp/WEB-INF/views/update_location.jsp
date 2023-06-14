<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>location</title>
</head>
<body>
     <h2>location | Update location</h2>
     <hr>
     <form action="saveLocation" method="post">
     <pre>
         Id<input type="text" name="id" value="${location.id}"/>
         Code<input type="text" name="code" value="${location.code}"/>
         Name<input type="text" name="name" value="${location.name}"/>
         Type:
         Urban<input type="radio" name="type" value="urban"/>
         Rural<input type="radio" name="type" value="rural"/>
         
         <input type="submit" value="save" />
     </pre>
     </form>
</body>
</html>