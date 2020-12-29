package base;

import java.util.ArrayList;

import derived.*;
import main.*;

public class Dispatch {

	static ArrayList<String> reports = new ArrayList<String>();

	// public void processReport(LabTest test) {
	//
	// }   // called by individual labs

	public static void processReport(String report) {
		reports.add(report);
	}

	public ArrayList<String> getAllResults() {
		return reports;
	}

}
