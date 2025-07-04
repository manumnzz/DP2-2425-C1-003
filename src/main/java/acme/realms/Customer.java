
package acme.realms;

import javax.persistence.Column;
import javax.persistence.Entity;

import acme.client.components.basis.AbstractRole;
import acme.client.components.mappings.Automapped;
import acme.client.components.validation.Mandatory;
import acme.client.components.validation.Optional;
import acme.client.components.validation.ValidNumber;
import acme.client.components.validation.ValidString;
import acme.constraints.ValidLongText;
import acme.constraints.ValidPhone;
import acme.constraints.ValidShortText;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer extends AbstractRole {

	//Serialisation version -------------------------------------------------

	private static final long	serialVersionUID	= 1L;

	//Atributes -------------------------------------------------------------

	@Mandatory
	@ValidString(pattern = "^[A-Z]{2,3}\\d{6}$")
	@Column(unique = true)
	protected String			identifier;

	@Mandatory
	@ValidPhone
	@Automapped
	protected String			phoneNumber;

	@Mandatory
	@ValidLongText
	@Automapped
	protected String			physicalAddress;

	@Mandatory
	@ValidShortText
	@Automapped
	protected String			city;

	@Mandatory
	@ValidShortText
	@Automapped
	protected String			country;

	@Optional
	@ValidNumber(max = 500000)
	@Automapped
	protected Double			earnedPoints;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
