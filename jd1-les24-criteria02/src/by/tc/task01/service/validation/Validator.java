package by.tc.task01.service.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {

	public static <E> boolean criteriaValidator(Criteria<E> criteria) {

		Pattern pattern1 = Pattern.compile("[A-Za-z]+");
		Matcher matcher1 = pattern1.matcher(criteria.getGroupSearchName().getSimpleName());

		Pattern pattern2 = Pattern.compile("[A-Z_]+");
		Pattern pattern3 = Pattern.compile("[\\w.-]+");

		for (Object key : criteria.getCriteria().keySet().toArray()) {
			Matcher matcher2 = pattern2.matcher(key.toString());
			Matcher matcher3 = pattern3.matcher(criteria.getCriteria().get(key).toString());

			if (!(matcher2.matches() && matcher3.matches())) {
				System.out.println("Key: " + key.toString() + " Object: " + criteria.getCriteria().get(key).toString());
				return false;
			}

		}
		return matcher1.matches();
	}

}