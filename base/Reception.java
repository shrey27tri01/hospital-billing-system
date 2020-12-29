package base;

import java.util.ArrayList;

import derived.*;
import main.*;

public class Reception {

	String id = "1";

	ArrayList<LabTest> labTests;

	public boolean addRequest(String testType, String patientName) {
		// should create the appropriate sub-type of LabTest,
		// add that to Billing and
		// then to the specific lab, after generating a patient ID

		// System.out.println(testType);
		// System.out.println(patientName);
		// System.out.println("ID: " + id);

		// System.out.println("Working till here");

		Billing billing = new Billing();
		PathLab pathLab = new PathLab();
		BioChemLab bioChemLab = new BioChemLab();

		if (testType.equals("Bio")) {
			BioChemTest bioTest = new BioChemTest (id);
			billing.billTest(bioTest);
			billing.addToTypesOfTests(testType);
			bioChemLab.addTest(bioTest);
		}
		else if (testType.equals("Path")) {
			// System.out.println("This is a path test");
			PathTest pathTest = new PathTest (id);
			billing.billTest(pathTest);
			billing.addToTypesOfTests(testType);
			pathLab.addTest(pathTest);
		}
		else {
			return false;
		}

		id = String.valueOf((Integer.parseInt(id) + 1));

		return true;
	}
}
