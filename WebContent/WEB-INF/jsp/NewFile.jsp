<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form  action="myController/indexSubmit" method="post">
    <select name="selectList" >
        <c:forEach items="${ls_value}" var="item" varStatus="count"> 
       <option value="${item}"  ${not empty selectListId && selectListId == item ? 'selected' : ''} >${item}</option>
       </c:forEach>
    </select>   
    <button type="submit" class="btn btn-primary btn-medium">Submit</button>   
</form>


</body>
</html>