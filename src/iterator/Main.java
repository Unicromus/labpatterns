package iterator;

import java.util.ArrayList;
import java.util.Iterator;

import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;
import factory.FactorySymptom;

public class Main {

	public static void main(String[] args) {

		FactorySymptom factorySymptom = new FactorySymptom();

		Covid19Pacient p = new Covid19Pacient("Ane", 29, factorySymptom);

		p.addSymptom(new Symptom("s1", 10, 10), 1);
		p.addSymptom(new Symptom("s2", 10, 10), 2);
		p.addSymptom(new Symptom("s3", 10, 10), 3);
		p.addSymptom(new Symptom("s4", 10, 10), 4);
		p.addSymptom(new Symptom("s5", 10, 10), 5);

		Iterator i = p.iterator();
		while(i.hasNext())
			System.out.println(i.next());

		System.out.println("----------");

		Covid19PacientInvertedIterator C19P_InvertedIterator = new Covid19PacientInvertedIterator(new ArrayList<Symptom>(p.getSymptoms()));
		Covid19PacientComparatorSymptomName C19P_ComparatorSymptomName = new Covid19PacientComparatorSymptomName();
		Covid19PacientComparatorSeverityIndex C19P_ComparatorSeverityIndex = new Covid19PacientComparatorSeverityIndex();

		Iterator i2 = Sorting.sortedIterator(C19P_InvertedIterator, C19P_ComparatorSymptomName);
		while(i2.hasNext())
			System.out.println(i2.next());

		System.out.println("----------");

		Iterator i3 = Sorting.sortedIterator(C19P_InvertedIterator, C19P_ComparatorSeverityIndex);
		while(i3.hasNext())
			System.out.println(i3.next());

	}

}
