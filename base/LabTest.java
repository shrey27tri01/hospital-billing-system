package base;

import derived.*;
import lab4b.*;

public class LabTest {

	private String patientId;

	protected LabTest(String patientId) {
		this.patientId = patientId;
	}   // note that this should never get called explicitly

	String getPatientId() {
		return this.patientId;
	}
	int getPrice() {
		return 0;
	}
	String getResult() {
		return null;
	}
}
