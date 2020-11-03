package Buoi7;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("Huy", "Tran", 500);

		System.out.println("Firstname: " + e1.getFirstName());
		System.out.println("Lastname: " + e1.getLastName());
		System.out.println("Base salary: " + e1.getBaseSalary());

		System.out.println();
		Employee e2 = new EmployeeWithBonus("Huy", "Tran", 500, 25);
		System.out.println("Firstname: " + e2.getFirstName());
		System.out.println("Lastname: " + e2.getLastName());
		System.out.println("Base salary: " + e2.getBaseSalary());
		System.out.println("Earning: " + e2.earnings());

	}

}
