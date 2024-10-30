package HomeWork_Day7;

public class Employee {
	// Tạo mảng chứa danh sách nhân viên
	private String[] employeeNames;

	public Employee(String[] employeeNames) {
		this.employeeNames = employeeNames;
	}

	public void printEmployeeName() {
		for (String name : employeeNames) {
			System.out.println(name);

		}

	}
}
