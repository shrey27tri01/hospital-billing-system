import java.util.ArrayList;
import java.util.Scanner;

import base.*;
import derived.*;

public class Test {

	public static void main(String[] args) {

		ArrayList<String> typesOfTests = new ArrayList<String>();

		// create instance of Reception, Billing, Dispatch, BioChemLab, PathLab

		// read in the input for test requests, and send to Reception (addRequest)
		Scanner s = new Scanner(System.in);
		int numberOfRequests = s.nextInt();

		Reception reception = new Reception();

		int nameNumber = 97;
		String patientName = null;

		for (int i = 0; i < numberOfRequests; i++) {
			patientName = "patient:" + Character.toString((char)nameNumber);
			String test = s.next();
			typesOfTests.add(test);
			reception.addRequest(test, patientName);
			nameNumber += 1;
		}

		// Billing billing = new Billing();

		// billing.allTests();

		System.out.println(typesOfTests);

		// get all bills from Billing and print out the total for the day


		// get all reports from Dispatch and print out one line at a time
		// Each line will have: Patient ID, Test ID, result string


		// get list of tests from each lab, and print out total tests per lab



		s.close();
	}

}

// Move to different packages and files
// Many return statements have default values (to allow them to be compiled.
// Replace with the correct statements.









// Similarly, define a PathLabTest, PathLab etc
