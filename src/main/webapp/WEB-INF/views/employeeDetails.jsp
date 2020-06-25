<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<style>           
.blue-button{
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',endColorstr='#188BC0',GradientType=0);
	padding:3px 5px;
	color:#fff;
	font-family:'Helvetica Neue',sans-serif;
	font-size:12px;
	border-radius:2px;
	-moz-border-radius:2px;
	-webkit-border-radius:4px;
	border:1px solid #1A87B9
}     
table {
  font-family: "Helvetica Neue", Helvetica, sans-serif;
   width: 50%;
}
th {
  background: SteelBlue;
  color: white;
}
 td,th{
                border: 1px solid gray;
                width: 25%;
                text-align: left;
                padding: 5px 10px;
            }
</style>
</head>
<body>
<form:form method="post" modelAttribute="employee" action="/SpringMVCHibernateCRUDExample/addEmployee">
<table>
		<tr>
			<th colspan="2">Add Employee</th>
		</tr>
		<tr>
		<form:hidden path="id" />
          <td><form:label path="employeeName">Employee Name:</form:label></td>
          <td><form:input path="employeeName" size="30" maxlength="30"></form:input></td>
        </tr>
		<tr>
			    <td><form:label path="department">Department:</form:label></td>
          <td><form:input path="department" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<h3>Employee List</h3>
<c:if test="${!empty listOfEmployees}">
	<table class="tg">
	<tr>
		<th width="80">Id</th>
		<th width="120">Employee Name</th>
		<th width="120">Department</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOfEmployees}" var="employee">
		<tr>
			<td>${employee.id}</td>
			<td>${employee.employeeName}</td>
			<td>${employee.department}</td>
			<td><a href="<c:url value='/updateemployee/${employee.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/deleteemployee/${employee.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
