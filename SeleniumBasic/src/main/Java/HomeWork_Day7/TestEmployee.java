package HomeWork_Day7;

import java.util.Scanner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestEmployee {
	private Employee employee;
	private Scanner scanner;
	

	@BeforeTest
	public void setup() {
		scanner = new Scanner(System.in);

		System.out.println("Nhập số lượng nhân viên: ");
		int numberOfEmployees = scanner.nextInt();
		scanner.nextLine(); 

		String[] employeeNames = new String[numberOfEmployees];

		for (int i = 0; i < numberOfEmployees; i++) {
			System.out.print("Nhập tên nhân viên " + (i + 1) + ": ");
			employeeNames[i] = scanner.nextLine();
		}
		employee = new Employee(employeeNames);
	}

	@Test
	public void testPrintEmployeeNames() {
		employee.printEmployeeName();
	}

	@AfterTest
	public void tearDown() {
		scanner.close();

	}
}
