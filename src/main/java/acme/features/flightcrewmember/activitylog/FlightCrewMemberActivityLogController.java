
package acme.features.flightcrewmember.activitylog;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import acme.client.controllers.AbstractGuiController;
import acme.client.controllers.GuiController;
import acme.entities.S3.ActivityLog;
import acme.realms.FlightCrewMember;

@GuiController
public class FlightCrewMemberActivityLogController extends AbstractGuiController<FlightCrewMember, ActivityLog> {

	//Internal state ---------------------------------------------------------

	@Autowired
	private FlightCrewMemberActivityLogListService		listService;

	@Autowired
	private FlightCrewMemberActivityLogShowService		showService;

	@Autowired
	private FlightCrewMemberActivityLogCreateService	createService;

	@Autowired
	private FlightCrewMemberActivityLogUpdateService	updateService;

	@Autowired
	private FlightCrewMemberActivityLogDeleteService	deleteService;

	@Autowired
	private FlightCrewMemberActivityLogPublishService	publishService;

	//Constructors ---------------------------------------------------------


	@PostConstruct
	protected void initialise() {
		super.addBasicCommand("list", this.listService);
		super.addBasicCommand("show", this.showService);
		super.addBasicCommand("create", this.createService);
		super.addBasicCommand("update", this.updateService);
		super.addBasicCommand("publish", this.deleteService);

		super.addCustomCommand("publish", "update", this.publishService);
	}
}
