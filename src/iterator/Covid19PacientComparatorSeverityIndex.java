package iterator;

import java.util.Comparator;

import domain.Symptom;

public class Covid19PacientComparatorSeverityIndex implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Symptom s1 = (Symptom)o1;
		Symptom s2 = (Symptom)o2;

		if (s1.getSeverityIndex() < s2.getSeverityIndex())
			return -1;
		else if (s1.getSeverityIndex() == s2.getSeverityIndex())
			return 0;
		else if (s1.getSeverityIndex() > s2.getSeverityIndex())
			return 1;
		return -1;
	}

}
