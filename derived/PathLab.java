package derived;

import java.util.ArrayList;

import base.*;
import main.*;

public class PathLab extends Lab {

  static int testIdIndex = 1;
  String testId = "P" + testIdIndex;

  static String[] pathResults = new String[] {"benign", "benign", "malignant"};
  static int index = 0;

  static ArrayList<PathTest> tests = new ArrayList<PathTest>();

  Dispatch dispatch = new Dispatch();

	public void addTest(PathTest test) {
  	// generates testId, the report,
  	// and then sends it to Dispatch using processReport
    String patientId = test.getPatientId();
    tests.add(test);
    String report = String.format("%s %s %s", patientId, testId, pathResults[index]);
    // System.out.println(report);
    dispatch.processReport(report);
    testIdIndex += 1;
    index = (index + 1) % 3;
	}

  public ArrayList<PathTest> getTests() {
    return tests;
  }

}
