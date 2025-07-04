package acme.forms;

import java.util.List;

import acme.client.components.basis.AbstractForm;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CrewMemberDashboard extends AbstractForm {
	// Serialisation version --------------------------------------------------

	private static final long serialVersionUID = 1L;

	// Attributes -------------------------------------------------------------


	private List<String> lastFiveDestinations;

	private List<Integer> incidentSeverity;

	private List<String> lastCrewMembers;

	private List<Integer> assignmentsStatus;

	private Double averageMonthly;
	private Integer minMonthly;
	private Integer maxMonthly;
	private Double stdDevMonthly;
}
