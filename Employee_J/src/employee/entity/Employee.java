package employee.entity;

public abstract class Employee {

	private int id;
	private String name;
	private String surname;
	private double hours; 
	public Employee(int id, String name, String surname, double hours) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.hours = hours;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public String toString() {
		return "Emploee [id=" + id + ", name=" + name + ", surname=" + surname + ", hours=" + hours + "]";
	}
    public abstract double calculateSalary() ;
    
    public double calculateTax() {
    	double salary = this.calculateSalary();
    	double tax = 0;
    	int [] levels= {0,6220,8920,14320,19900,41410,53333};
    	double [] rates= {0.1, 0.14 ,0.2 ,0.31 ,0.35 ,0.47 ,0.5};
    	for (int i = 0; i < rates.length; i++) {
			if(salary>levels[i]&&salary<=levels[i+1]) {
				return tax+(salary-levels[i]*rates[i]);
			}
			else {
				tax=tax+((salary-levels[i+1])*rates[i]);
			}
		}
    	return tax+((salary-levels[levels.length])*rates[rates.length]);
    }
    public void showTax() {
    	System.out.println(this.getName());
        System.out.println(this.getSurname());
        System.out.println(this.getId());
        System.out.println("Salary before tax: "+calculateSalary());
        System.out.println("Tax is:"+this.calculateTax());
        System.out.println("Salary after tax: "+(this.calculateSalary()-this.calculateTax()));
        System.out.println("***********************************");
    }
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(hours);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(hours) != Double.doubleToLongBits(other.hours))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
}