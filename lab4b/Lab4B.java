package lab4b;

import java.util.ArrayList;
import java.util.Scanner;

import base.*;
import derived.*;

public class Lab4B {

	public static void main(String[] args) {

		ArrayList<String> typesOfTests = new ArrayList<String>();

		int nameNumber = 97;
		String patientName = null;

		// create instance of Reception, Billing, Dispatch, BioChemLab, PathLab
		Reception reception = new Reception();
		Billing billing = new Billing();
		Dispatch dispatch = new Dispatch();
		BioChemLab bioChemLab = new BioChemLab();
		PathLab pathLab = new PathLab();

		// read in the input for test requests, and send to Reception (addRequest)
		Scanner s = new Scanner(System.in);
		int numberOfRequests = s.nextInt();

		for (int i = 0; i < numberOfRequests; i++) {
			patientName = "patient:" + Character.toString((char)nameNumber);
			String test = s.next();
			typesOfTests.add(test);
			reception.addRequest(test, patientName);
			nameNumber += 1;
		}

		// get all bills from Billing and print out the total for the day
		System.out.println(billing.getTypesOfTests());
		System.out.println("Total billed: " + billing.getTotalPrice());

		// get all reports from Dispatch and print out one line at a time
		// Each line will have: Patient ID, Test ID, result string


		// get list of tests from each lab, and print out total tests per lab



		s.close();
	}

}
