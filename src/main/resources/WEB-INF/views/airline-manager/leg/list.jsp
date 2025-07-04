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
	<acme:list-column code="airline-manager.leg.label.scheduledDeparture" path="scheduledDeparture" width="20%" />
	<acme:list-column code="airline-manager.leg.label.scheduledArrival" path="scheduledArrival" width="20%" />
	<acme:list-column sortable="false" code="airline-manager.leg.label.departureAirport" path="departureAirport" width="20%" />
	<acme:list-column sortable="false" code="airline-manager.leg.label.arrivalAirport" path="arrivalAirport" width="20%" />			
</acme:list>

<jstl:if test="${_command == 'list' && draftMode == true}">
	<acme:button code="airline-manager.leg.list.button.create" action="/airline-manager/leg/create?flightId=${flightId}"/>
</jstl:if>
