package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.FactorySymptom;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		FactorySymptom factorySymptom = new FactorySymptom();

		Covid19Pacient pacient1 = new Covid19Pacient("aitor", 35, factorySymptom);		// Observable
		Covid19Pacient pacient2 = new Covid19Pacient("david", 21, factorySymptom);		// Observable
		Covid19Pacient pacient3 = new Covid19Pacient("alvaro", 21, factorySymptom);		// Observable

		PacientObserverGUI pacientGUI1 = new PacientObserverGUI(pacient1);
		PacientSymptomGUI interface11 = new PacientSymptomGUI(pacient1);
		PacientThermometerGUI interface21 = new PacientThermometerGUI(pacient1);
		SemaphorGUI interface31 = new SemaphorGUI(pacient1);

		/*
		PacientObserverGUI pacientGUI2 = new PacientObserverGUI(pacient2);
		PacientSymptomGUI interface12 = new PacientSymptomGUI(pacient2);
		PacientThermometerGUI interface22 = new PacientThermometerGUI(pacient2);
		SemaphorGUI interface32 = new SemaphorGUI(pacient2);
		 */

		/*
		PacientObserverGUI pacientGUI3 = new PacientObserverGUI(pacient3);
		PacientSymptomGUI interface13 = new PacientSymptomGUI(pacient3);
		PacientThermometerGUI interface23 = new PacientThermometerGUI(pacient3);
		SemaphorGUI interface33 = new SemaphorGUI(pacient3);
		 */

	}

}
