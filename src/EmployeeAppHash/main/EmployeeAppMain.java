package EmployeeAppHash.main;

import EmployeeAppHash.models.Employee;
import EmployeeAppHash.services.EmployeeServices;

public class EmployeeAppMain {
	static EmployeeServices employeeServices = new EmployeeServices();

	public static void main(String[] args) {
		create_employee(new Employee(1, "James", "Peach", 987345.6));
		create_employee(new Employee(23, "Charles", "Xavier", 410.6));
		create_employee(new Employee(1234, "Bub", "Shinct", 58742.6));
		create_employee(new Employee(7479, "Kyle", "Rachau", 652.6));
		remove_employee();
		print_employee_list();
	}

	private static void remove_employee() {
		// TODO Auto-generated method stub
		
	}

	private static void print_employee_list() {
		// TODO Auto-generated method stub
		System.out.println(employeeServices.getEmployees());
	}

	private static void create_employee(Employee employee) {
		//Employee employee = new Employee(1, "James", "Peach", 987345.6);
		employeeServices.addEmployee(employee);
	}

}
