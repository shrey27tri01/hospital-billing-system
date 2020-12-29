package derived;

import java.util.ArrayList;

import base.*;
import main.*;

public class BioChemLab extends Lab {

	static int testIdIndex = 1;
  String testId = "B" + testIdIndex;

	static int result = 100;

  static ArrayList<BioChemTest> tests = new ArrayList<BioChemTest>();

	Dispatch dispatch = new Dispatch();

	public void addTest(BioChemTest test) {
  	// generates testId, the report,
  	// and then sends it to Dispatch using processReport
    String patientId = test.getPatientId();
    tests.add(test);
    String report = String.format("%s %s %s", patientId, testId, result);
		// System.out.println(report);
    dispatch.processReport(report);
    testIdIndex += 1;
		result += 1;
		// System.out.println(testIdIndex);
	}

	public ArrayList<BioChemTest> getTests() {
    return tests;
  }

}
