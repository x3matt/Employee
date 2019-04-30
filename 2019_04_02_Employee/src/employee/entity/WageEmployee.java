package employee.entity;

import employee.stateconstants.StateConstants;

public class WageEmployee extends Employee {

	private double WAGE;
	
	public WageEmployee(int id, String name, String surname, double hours, double wAGE) {
		super(id, name, surname, hours);
		WAGE = wAGE;
	}
	public double getWAGE() {
		return WAGE;
	}
	public void setWAGE(double wAGE) {
		WAGE = wAGE;
	}
	public String toString() {
		return "WageEmployee [WAGE=" + WAGE + ", toString()=" + super.toString() + "]";
	}
	public double calculateSalary() {
		double salary=super.getHours()*WAGE;
		if(salary <= super.getHours()*StateConstants.MIN_WAGE) {
			salary=super.getHours()*StateConstants.MIN_WAGE;
			return salary;
		}
		return salary;
	}
}