package vn.vtd.wls.validator.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
			return false;
		}

		int len = value.length();

		if (len < 6 || len > 32) {
			return false;
		}

		boolean isNumber = false;
		boolean isLowercase = false;
		boolean isUppercase = false;
		boolean isSpecial = false;

		char chr;
		for (int i = 0; i < len; i++) {
			chr = value.charAt(i);
			if (chr >= 'a' && chr <= 'z') {
				isLowercase = true;
			} else if (chr >= 'A' && chr <= 'Z') {
				isUppercase = true;
			} else if (chr >= '0' && chr <= '9') {
				isNumber = true;
			} else {
				isSpecial = true;
			}
		}

		int dem = 0;

		if (isNumber) {
			dem++;
		}

		if (isLowercase) {
			dem++;
		}

		if (isUppercase) {
			dem++;
		}

		if (isSpecial) {
			dem++;
		}

		return dem >= 3;
	}

}
