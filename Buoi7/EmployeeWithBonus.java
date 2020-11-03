package Buoi7;

public class EmployeeWithBonus extends Employee {
	private double bonus;
	
	public EmployeeWithBonus(String firstName, String lastName, double baseSalary, double bonus) {
		super(firstName, lastName, baseSalary);
		setBonus(bonus);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		if (bonus > 0) {
			this.bonus = bonus;
		}
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return super.earnings() + bonus;
	}

}
