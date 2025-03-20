
package acme.constraints;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidatorContext;

import acme.client.components.validation.AbstractValidator;
import acme.client.components.validation.Validator;
import acme.datatypes.Phone;

@Validator
public class PhoneValidator extends AbstractValidator<ValidPhone, Phone> {
	// ConstraintValidator interface ------------------------------------------

	private static final String PHONE_PATTERN = "^\\+?\\d{6,15}$";


	@Override
	protected void initialise(final ValidPhone annotation) {
		assert annotation != null;
	}

	@Override
	public boolean isValid(final Phone phone, final ConstraintValidatorContext context) {
		// HINT: phone can be null
		assert context != null;

		boolean result;
		boolean isNull;

		isNull = phone == null || phone.getNumber() == null;

		if (!isNull) {
			String number;
			boolean inRange;

			number = phone.getNumber();
			inRange = number != null && Pattern.matches(PhoneValidator.PHONE_PATTERN, number);
			super.state(context, inRange, "number", "acme.validation.phone.message");
		}

		result = !super.hasErrors(context);

		return result;
	}
}
