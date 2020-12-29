package base;

import derived.*;
import main.*;

import java.util.ArrayList;

public class Billing {

	int costPathLabTest = 1000;
	int costBioChemLabTest = 400;

	ArrayList<LabTest> testsBilled = new ArrayList<LabTest>();
	static ArrayList<String> typesOfTests = new ArrayList<String>();

	void billTest(LabTest test) {
		testsBilled.add(test);
	}  // called by Reception

	void addToTypesOfTests(String type) {
		typesOfTests.add(type);
		// System.out.println(typesOfTests);
	}

	public ArrayList<String> getTypesOfTests() {
		return typesOfTests;
	}

	public int getTotalPrice() {
		int total = 0;
		for (String typeOfTest : typesOfTests) {
			if (typeOfTest.equals("Bio")) {
				total += costBioChemLabTest;
			} else if (typeOfTest.equals("Path")) {
				total += costPathLabTest;
			}
		}
		return total;
	}

	// public void printTests() {
	// 	System.out.println(typesOfTests);
	// }

	ArrayList<String> getBills() {
		return null;
	} // one string for each test
	// each string has testId and billed amount, separated by a space

}
