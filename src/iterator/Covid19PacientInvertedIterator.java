package iterator;

import java.util.List;

import adapter.InvertedIterator;
import domain.Symptom;

public class Covid19PacientInvertedIterator implements InvertedIterator {
	
	List<Symptom> symptoms;
	int position = 0;

	public Covid19PacientInvertedIterator(List<Symptom> s) {
		this.symptoms = s;
		this.position = symptoms.size()-1;
	}

	// true if there is a previous element
	@Override
	public boolean hasPrevious() {
		return position >= 0;
	}

	// return the actual element and go to the previous
	@Override
	public Object previous() {
		Symptom symptom = symptoms.get(position);
		position--;
		return symptom;
	}

	// It is placed in the last element
	@Override
	public void goLast() {
		position = symptoms.size()-1;
	}

}
