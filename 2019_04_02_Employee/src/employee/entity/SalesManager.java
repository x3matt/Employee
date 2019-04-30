package employee.entity;

import employee.stateconstants.StateConstants;

public class SalesManager extends Employee {

	private double salesValue;
	private double percent;
	public SalesManager(int id, String name, String surname, double hours, double salesValue, double percent) {
		super(id, name, surname, hours);
		this.salesValue = salesValue;
		this.percent = percent;
	}
	public double getSalesValue() {
		return salesValue;
	}
	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public String toString() {
		return "SalesManager [salesValue=" + salesValue + ", percent=" + percent + ", toString()=" + super.toString()
				+ "]";
	}
	public double calculateSalary() {
		double salary=salesValue*percent;
		if(salary <=super.getHours()*StateConstants.MIN_WAGE) {
			salary=super.getHours()*StateConstants.MIN_WAGE;
			return salary;
		}
		return salary;
	}
	
}
