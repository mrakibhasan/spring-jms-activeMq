<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title>Vendor Collection System</title>
</head>
<body>
	
	<div>
		<h2>Vendor Entry</h2>
	</div>
	<div id="form">
		<form:form modelAttribute="vendor" action="vendor">
			<div class="message">
				<c:if test="${!empty message}">
					<c:out value="${message}"></c:out>
				</c:if>
			</div>
			<fieldset>
				<legend>Customer Information</legend>
				<div>
					<label for="vendorName">Vendor Name</label>
					<form:input path="vendorName" />
				</div>
				<div>
					<label for="firstName">First Name</label>
					<form:input path="firstName" />
				</div>
				<div>
					<label for="lastName">Last Name</label>
					<form:input path="lastName" />
				</div>
				<div>
					<label for="address">Address</label>
					<form:input path="address" />
				</div>
				<div>
					<label for="city">City</label>
					<form:input path="city" />
				</div>
				<div>
					<label for="state">State</label>
					<form:select path="state">
						<form:option value="Alabama">Alabama</form:option>
						<form:option value="Alaska">Alaska</form:option>
						<form:option value="Arizona">Arizona</form:option>
						<form:option value="Arkansas">Arkansas</form:option>
						<form:option value="California">California</form:option>
						<form:option value="Colorado">Colorado</form:option>
						<form:option value="Delaware">Delaware</form:option>
						<form:option value="Florida">Florida</form:option>
						<form:option value="Georgia">Georgia</form:option>
						<form:option value="Hawaii">Hawaii</form:option>
						<form:option value="Idaho">Idaho</form:option>
						<form:option value="Illinois">Illinois</form:option>
						<form:option value="Indiana">Indiana</form:option>
						<form:option value="Iowa">Iowa</form:option>
						<form:option value="Kansas">Kansas</form:option>
						<form:option value="Kentucky">Kentucky</form:option>
						<form:option value="Louisana">Louisana</form:option>
						<form:option value="Maine">Maine</form:option>
						<form:option value="Maryland">Maryland</form:option>
						<form:option value="Massachusetts">Massachusetts</form:option>
						<form:option value="Michigan">Michigan</form:option>
						<form:option value="Minnesota">Minnesota</form:option>
						<form:option value="Mississippi">Mississippi</form:option>
						<form:option value="Missouri">Missouri</form:option>
						<form:option value="Montana">Montana</form:option>
						<form:option value="Nebraska">Nebraska</form:option>
						<form:option value="Nevada">Nevada</form:option>
						<form:option value="New Hampshire">New Hampshire</form:option>
						<form:option value="New Jersey">New Jersey</form:option>
						<form:option value="New Mexico">New Mexico</form:option>
						<form:option value="New York">New York</form:option>
						<form:option value="North Carolina">North Carolina</form:option>
						<form:option value="North Dakota">North Dakota</form:option>
						<form:option value="Ohio">Ohio</form:option>
						<form:option value="Oklahoma">Oklahoma</form:option>
						<form:option value="Oregon">Oregon</form:option>
						<form:option value="Pennsylvania">Pennsylvania</form:option>
						<form:option value="Rhode Island">Rhode Island</form:option>
						<form:option value="South Carolina">South Carolina</form:option>
						<form:option value="South Dakota">South Dakota</form:option>
						<form:option value="Tennessee">Tennessee</form:option>
						<form:option value="Texas">Texas</form:option>
						<form:option value="Utah">Utah</form:option>
						<form:option value="Vermont">Vermont</form:option>
						<form:option value="Virginia">Virginia</form:option>
						<form:option value="Vermont">Vermont</form:option>
						<form:option value="Washington">Washington</form:option>
						<form:option value="Wisconsin">Wisconsin</form:option>
						<form:option value="West Virginia">West Virginia</form:option>
						<form:option value="Wyoming">Wyoming</form:option>
					</form:select>
				</div>
				<div>
					<label for="zipCode">Zip Code</label>
					<form:input path="zipCode" />
				</div>
				<div>
					<label for="email">Email</label>
					<form:input path="email" />
				</div>
				<div>
					<label for="phoneNumber">Phone Number</label>
					<form:input path="phoneNumber" />
				</div>
				<div>
					<input type="submit" value="Submit" />
				</div>
			</fieldset>

		</form:form>
	</div>
</body>
</html>
