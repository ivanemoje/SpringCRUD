<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact App</title>
</head>
<body>
    <div align="center">
        <h1>Contact List</h1>
        <h3>
            <a href="newcontact">New Contact</a>
        </h3>
        <table border="1">
 <tr>
            <th>Name</th>
            <th>Email Address</th>
            <th>Phone Number</th>
            <th>Action</th>
 
            <c:forEach var="contact" items="${listContact}">
                <tr>
 
                    <td>${contact.firstname} ${contact.lastname}</td>
                    <td>${contact.emailaddress}</td>
                    <td>${contact.phoneaddress}</td>
                    <td><a href="editcontact?id=${contact.id}">Edit</a>
                             <a
                        href="deletecontact?id=${contact.id}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>