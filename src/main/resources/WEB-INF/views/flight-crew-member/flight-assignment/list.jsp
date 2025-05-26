<%--
- list.jsp
-
- Copyright (C) 2012-2025 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" uri="http://acme-framework.org/"%>

<acme:list>
	<acme:list-column path="flightCrew" code="flight-crew-member.flight-assignment.list.label.flightCrew" width="20%"/>
	<acme:list-column path="moment" code="flight-crew-member.flight-assignment.list.label.moment" width="30%"/>
	<acme:list-column path="currentStatus" code="flight-crew-member.flight-assignment.list.label.currentStatus" width="30%"/>
	<acme:list-column path="remarks" code="flight-crew-member.flight-assignment.list.label.remarks" width="20%"/>
</acme:list>

<acme:button code="flight-crew-member.flight-assignment.form.button.create" action="/flight-crew-member/flight-assignment/create"/>