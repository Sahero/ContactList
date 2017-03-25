<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
<title>List Contacts</title>
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Contacts</h2>
		</div>
	</div>


	<div id="container">
		<div class="content">
			<!-- put new button:Add Contacts -->
			<input type="button" class="add-button" value="Add Contacts"
				onclick="window.location.href='showFormForAdd'; return false;" />
			<table>
				<thead>
					<tr>
						<th>S.N</th>
						<th>First Name</th>
						<th>Middle Name</th>
						<th>Last Name</th>
						<th>Date Of Birth</th>
						<th>Email</th>
						<th>Phone Number</th>
						<th>Address</th>
						<th>Action</th>
					</tr>
				</thead>
				<c:forEach var="tempContacts" items="${contacts}" varStatus="loop">
					<!-- construct an 'update' link with Contacts id -->
					<c:url var="updateLink" value="/contacts/showFormForUpdate">
						<c:param name="contactsId" value="${tempContacts.id}" />
					</c:url>
					<!-- construct an 'delete' link with Contacts id -->
					<c:url var="deleteLink" value="/contacts/delete">
						<c:param name="contactsId" value="${tempContacts.id}" />
					</c:url>
					<tr class="${loop.count % 2==0?'alt':''}">
						<td>${loop.count}</td>
						<td>${tempContacts.firstName}</td>
						<td>${tempContacts.middleName}</td>
						<td>${tempContacts.lastName}</td>
						<td>${tempContacts.dateOfBirth}</td>
						<td>${tempContacts.email}</td>
						<td>${tempContacts.phoneNumber}</td>
						<td>${tempContacts.address}</td>
						<td>
							<!--  display the updade link --> <a href="${updateLink}">Update</a>
							| <!--  display the delete link --> <a href="${deleteLink}"
							onclick="if (!(confirm('Are you sure you want to delete this Contacts?'))) return false;">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>