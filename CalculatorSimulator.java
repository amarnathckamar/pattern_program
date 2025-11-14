package demo;

import java.util.Scanner;

// Custom exception for invalid country
class CountryNotValidException extends Exception {
	public String getMessage() {
		return("The employee should be an Indian citizen for calculating tax");
	}
}

// Custom exception for empty employee name
class EmployeeNameInvalidException extends Exception {
	public String getMessage() {
		return("The employee name cannot be empty");
	}
}

// Custom exception for employees who do not need to pay tax
class TaxNotEligibleException extends Exception {
	public String getMessage() {
		return("The employee does not need to pay tax");
	}
}

class TaxCalculator {

	// Method to calculate tax
	public double calculateTax(String EmpName, boolean indian, double empsal) throws CountryNotValidException, TaxNotEligibleException, EmployeeNameInvalidException {

		// Check if employee is Indian
		if (!indian) {
			CountryNotValidException c = new CountryNotValidException();
			throw c;
		}
		else {
			// Check if name is empty
			if (EmpName == null || EmpName.isEmpty()) {
				EmployeeNameInvalidException e = new EmployeeNameInvalidException();
				throw e;
			}

			// Calculating tax based on the salary
			if (empsal > 100000) {
				return empsal * 8 / 100;
			} else if (empsal > 50000 && empsal <= 100000) {
				return empsal * 6 / 100;
			} else if (empsal > 30000 && empsal <= 50000) {
				return empsal * 5 / 100;
			} else if (empsal > 10000 && empsal <= 30000) {
				return empsal * 4 / 100;
			} else {
				// if salary is less than 10000 then do not need to pay the tax
				TaxNotEligibleException t = new TaxNotEligibleException();
				throw t;
			}
		}
	}
}

public class CalculatorSimulator {
	public static void main(String[] args) {

		// Creating the TaxCalculator object
		TaxCalculator tax = new TaxCalculator();
		
		
		
		String name = "";
		int salary = 50000;
		boolean indian = true;

		try {
			// Calling the tax calculation method
			double taxAmount = tax.calculateTax(name, indian, salary);

			// Printing result
			System.out.println("Tax amount is: " + taxAmount);
		}
		catch (Exception e) {
			// If any exception occurs, print it
			System.out.println(e.toString());
		}
	}
}
