package base;

import derived.*;
import main.*;

public class LabTest {

	private String patientId;

	protected LabTest(String patientId) {
		this.patientId = patientId;
	}   // note that this should never get called explicitly

	public String getPatientId() {
		return this.patientId;
	}
	int getPrice() {
		return 0;
	}
	String getResult() {
		return null;
	}
}
