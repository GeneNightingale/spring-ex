<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>

<head>
	<title>To-Do List Manager</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
		  rel="stylesheet">

</head>

<body>

<nav role="navigation" class="navbar navbar-default" href="/list-todos">
		<a href="/" class="navbar-brand">To-Do List</a>
</nav>
<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-lg btn-block" href="/add-todo">Add Todo</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>Your Todo's</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="50%">Description</th>
						<th width="30%">Date</th>
						<th width="20%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.description}</td>
							<td><fmt:formatDate value="${todo.targetDate}"
									pattern="dd/MM/yyyy" /></td>
							<td><a type="button" class="btn btn-primary"
								   href="/update-todo?id=${todo.id}">Update</a>
								<a type="button" class="btn btn-danger"
								   href="/delete-todo?id=${todo.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>