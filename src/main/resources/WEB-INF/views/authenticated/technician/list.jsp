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
	<acme:list-column path="maintenanceDate" code="authenticated.technician.maintenanceRecord.list.label.maintenanceDate" width="20%"/>
	<acme:list-column path="scheduledDeparture" code="authenticated.technician.maintenanceRecord.list.label.status" width="20%"/>
	<acme:list-column path="scheduledArrival" code="authenticated.technician.maintenanceRecord.list.label.nextInspectionDue" width="20%"/>
	<acme:list-column path="cost" code="authenticated.technician.maintenanceRecord.list.label.estimatedCost" width="20%"/>
	<acme:list-column path="technician" code="authenticated.technician.maintenanceRecord.list.label.technician" width="20%"/>
	<acme:list-column path="aircraft" code="authenticated.technician.maintenanceRecord.list.label.aircraft" width="20%"/>
</acme:list>
