
package acme.features.flightcrewmember.flightassignments;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import acme.client.controllers.AbstractGuiController;
import acme.client.controllers.GuiController;
import acme.entities.S3.FlightAssignment;
import acme.realms.FlightCrewMember;

@GuiController
public class FlightCrewMemberFlightAssignmentsController extends AbstractGuiController<FlightCrewMember, FlightAssignment> {

	//Internal state ---------------------------------------------------------

	@Autowired
	private FlightCrewMemberFlightAssignmentsListService	listService;

	@Autowired
	private FlightCrewMemberFlightAssignmentsShowService	showService;

	@Autowired
	private FlightCrewMemberFlightAssignmentsCreateService	createService;

	@Autowired
	private FlightCrewMemberFlightAssignmentsUpdateService	updateService;

	@Autowired
	private FlightCrewMemberFlightAssignmentsDeleteService	deleteService;

	@Autowired
	private FlightCrewMemberFlightAssignmentsPublishService	publishService;

	//Constructors ---------------------------------------------------------


	@PostConstruct
	protected void initialise() {
		super.addBasicCommand("list", this.listService);
		super.addBasicCommand("show", this.showService);
		super.addBasicCommand("create", this.createService);
		super.addBasicCommand("update", this.updateService);
		super.addBasicCommand("delete", this.deleteService);

		super.addCustomCommand("publish", "update", this.publishService);
	}
}
