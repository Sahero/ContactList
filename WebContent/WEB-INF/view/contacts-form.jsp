<%@  taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

<title>Save Contacts</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Add New Contact</h2>
		</div>
	</div>

	<div class="contents">
		<h3>Save Contacts</h3>
		<form:form action="saveContacts" modelAttribute="contacts"
			method="POST">
			<!-- need to associate this data with Contacts id -->
			<form:hidden path="id"/>
			<div class="content">
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr class="alt">
						<td><label>Middle name:</label></td>
						<td><form:input path="middleName" /></td>
					</tr>
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr class="alt">
						<td><label>Date of birth:</label></td>
						<td><form:input path="dateOfBirth" /></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					</tr>
					
					<tr class="alt">
						<td><label>Phone number:</label></td>
						<td><form:input path="phoneNumber" /></td>
					</tr>
					<tr>
						<td><label>Address:</label></td>
						<td><form:input path="address" /></td>
					</tr>
					<tr class="alt">
						<td><label>Remarks:</label></td>
						<td><form:input path="remarks" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				</tbody>
			</table>
			</div>
		</form:form>
		<div style="clear;both;"></div>
		<p>
			<a class="save" href="${pageContext.request.contextPath}/contacts/list">Back to list</a>
		</p>
	</div>
</body>
</html>

