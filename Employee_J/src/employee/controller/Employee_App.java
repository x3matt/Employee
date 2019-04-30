package employee.controller;
import employee.dao.Company;
import employee.entity.*;
public class Employee_App {

	public static void main(String[] args) {
		
		Company c1 = new Company(10);
        SalesManager sm1 = new SalesManager(1, "Vas", "Pes", 240, 200000, 0.1);
        SalesManager sm2 = new SalesManager(2, "Andrew", "Pes", 220, 20000000, 0.1);
        SalesManager sm3 = new SalesManager(3, "Timur", "Pes", 160, 2000000, 0.1);
        
        WageEmployee we1 = new WageEmployee(4, "Per", "Kul", 232, 9.12);
        WageEmployee we2 = new WageEmployee(5, "Udmurt", "Kul", 94, 9.2);
        WageEmployee we3 = new WageEmployee(6, "Mort", "Kul", 80, 9.13);
        WageEmployee we4 = new WageEmployee(7, "Mortar", "Kul", 92, 9.13);
        WageEmployee we5 = new WageEmployee(8, "Mortello", "Kul", 80, 9.13);
        
        c1.addEmployee(sm1);
        c1.addEmployee(sm2);
        c1.addEmployee(sm3);
        c1.addEmployee(we1);
        c1.addEmployee(we2);
        c1.addEmployee(we3);
        System.out.println(sm1.calculateSalary());
        System.out.println(sm1.calculateTax());
        sm1.showTax();
        System.out.println("Min salary"+c1.minSalary());
        System.out.println("Max salary"+c1.maxSalary());
        System.out.println("FOT "+c1.sumSalary());
        System.out.println(c1.employeeMinSalary());
        System.out.println("********************");
        c1.poorMens(3);
        int F;
 	}
}