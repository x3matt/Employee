package employee.dao;
import employee.entity.*;
public class Company {

	private int size;
	private Employee[] employees;
	
	public Company(int capacity) {
		employees = new Employee[capacity];
		size=0;
	}
	public boolean addEmployee(Employee employee) {
		if(size<employees.length) {
			employees[size]=employee;
			size++;
			return true;
		}
		return false;
	}
	public boolean removeEmployee(Employee employee) {
		for (int i = 0; i < size; i++) {
			if(employees[i].equals(employee)) {
				employees[i]=employees[size-1];
				size--;
				return true;
			}
		  }
	    return false;
	}
	public void idRemove(int id) {
		for (int i = 0; i < size; i++) {
			if(id == employees[i].getId()) {
				employees[i]=employees[size-1];
				size--;
			 }
		 }
	}
	public void nameRemove(String name) {
		for (int i = 0; i < size; i++) {
			if(name == employees[i].getName()) {
				employees[i]=employees[size-1];
				size--;
			 }
		 }
    }
	public double minSalary() {
		double min = employees[0].calculateSalary();
		for (int i = 0; i < size; i++) {
			if(employees[i].calculateSalary()<min) {
				min=employees[i].calculateSalary();
			}
		}
		return min;
	}
	public double maxSalary() {
		double max = employees[0].calculateSalary();
		for (int i = 0; i < size; i++) {
			if(employees[i].calculateSalary()>max) {
				max=employees[i].calculateSalary();
			}
		}
		return max;
	}
	public double sumSalary() {
		double sum=0;
		for (int i = 0; i < size; i++) {
			sum=sum+employees[i].calculateSalary();
		}
		return sum;
	}
	public Employee employeeMinSalary() {
		Employee min = employees[0];
		for (int i = 0; i < size; i++) {
			if(employees[i].calculateSalary()<min.calculateSalary()) {
				min=employees[i];
				
			}
		}
		return min;
	}
	public Employee employeeMaxSalary() {
		Employee max = employees[0];
		for (int i = 0; i < employees.length; i++) {
		if(employees[i].calculateSalary()>max.calculateSalary()) {
			max=employees[i];
		}
	}
		return max;
  }
	public Employee[] poorMens(int num) {
		double minSalary = this.minSalary();
		Employee[] min = new Employee[num];
		int SIZE =0;
		for (int i = 0; i < size; i++) {
			if(employees[i].calculateSalary()==minSalary && SIZE<num) {
				min[SIZE]=employees[i];
				SIZE++;
			}
		}
		return min;
	}
	public void display() {
		for (int i = 0; i < size; i++) {
	    employees[i].showTax();
	}
  }
	public void display(Employee employee) {
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}
}