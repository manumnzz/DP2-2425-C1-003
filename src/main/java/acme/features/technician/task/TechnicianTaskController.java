
package acme.features.technician.task;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import acme.client.controllers.AbstractGuiController;
import acme.client.controllers.GuiController;
import acme.entities.maintenance.Task;
import acme.realms.Technician;

@GuiController
public class TechnicianTaskController extends AbstractGuiController<Technician, Task> {

	@Autowired
	private TechnicianTaskListAsociatedService	listAsociatedService;

	@Autowired
	private TechnicianTaskListService			listService;

	@Autowired
	private TechnicianTaskShowService			showService;

	@Autowired
	private TechnicianTaskCreateService			createService;

	@Autowired
	private TechnicianTaskUpdateService			updateService;

	@Autowired
	private TechnicianTaskDeleteService			deleteService;

	@Autowired
	private TechnicianTaskPublishService		publishService;


	@PostConstruct
	protected void initialise() {
		super.addBasicCommand("list", this.listService);
		super.addBasicCommand("show", this.showService);
		super.addBasicCommand("create", this.createService);
		super.addBasicCommand("update", this.updateService);
		super.addBasicCommand("delete", this.deleteService);
		super.addCustomCommand("publish", "update", this.publishService);
		super.addCustomCommand("listAsociated", "list", this.listAsociatedService);

	}

}
