<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:url var="actionUrl" value="save" />

<form:form id="bdForm" commandName="birthday" method="post"
	action="${actionUrl }" class="pure-form pure-form-aligned">

	<fieldset>
		<legend></legend>

		<div class="pure-control-group">
			<label for="firstName">First Name</label>
			<form:input id="firstName" path="firstName" placeholder="First Name" />
		</div>
		<div class="pure-control-group">
			<label for="lastName">Last Name</label>
			<form:input id="lastName" path="lastName" placeholder="Last Name" />
		</div>
		<div class="pure-control-group">
			<label for="birthDay">Birth Day</label>
			<form:input path="birthDay"
				placeholder="YYYY-MM-DD" class="datepicker" />
		</div>

		<form:input path="id" type="hidden" />

	</fieldset>
</form:form>