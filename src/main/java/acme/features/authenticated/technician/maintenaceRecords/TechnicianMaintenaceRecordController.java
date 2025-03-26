
package acme.features.authenticated.technician.maintenaceRecords;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import acme.client.controllers.AbstractGuiController;
import acme.entities.maintenance.MaintenanceRecord;
import acme.realms.Technician;

public class TechnicianMaintenaceRecordController extends AbstractGuiController<Technician, MaintenanceRecord> {

	@Autowired
	private TechnicianMaintenaceRecordListService	ListService;

	@Autowired
	private TechnicianMaintenaceRecordShowService	ShowService;


	@PostConstruct
	protected void initialise() {
		super.addBasicCommand("list", this.ListService);
		super.addBasicCommand("show", this.ShowService);
	}

}
