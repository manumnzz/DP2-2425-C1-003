
package acme.features.airlinemanager.flight;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import acme.client.components.models.Dataset;
import acme.client.services.AbstractGuiService;
import acme.client.services.GuiService;
import acme.entities.S1.Flight;
import acme.realms.AirlineManager;

@GuiService
public class AirlineManagerFlightListService extends AbstractGuiService<AirlineManager, Flight> {

	@Autowired
	private AirlineManagerFlightRepository repository;


	@Override
	public void authorise() {
		boolean status = super.getRequest().getPrincipal().hasRealmOfType(AirlineManager.class);

		super.getResponse().setAuthorised(status);
	}

	@Override
	public void load() {
		Collection<Flight> flights;
		int airlineManagerId;

		airlineManagerId = super.getRequest().getPrincipal().getActiveRealm().getId();
		flights = this.repository.findFlightsByManagerId(airlineManagerId);

		super.getBuffer().addData(flights);
	}

	@Override
	public void unbind(final Flight flight) {
		Dataset dataset;

		dataset = super.unbindObject(flight, "tag", "selfTransfer", "cost", "description", "originCity", "destinationCity");

		super.getResponse().addData(dataset);
	}
}
