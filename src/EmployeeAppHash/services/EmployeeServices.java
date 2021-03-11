package EmployeeAppHash.services;

import java.util.HashMap;

import EmployeeAppHash.models.Employee;
import EmployeeAppHash.models.EmployeeI;

public class EmployeeServices implements EmployeeI {

	private HashMap<Integer, Employee> employees = new HashMap<>();

	@Override
	public boolean addEmployee(Employee employee) {
		boolean result = false;
		if(employee != null) {
			this.employees.put(employee.getId(), employee);
			result = true;
		}	
		return result;
	}

	@Override
	public Employee removeEmployee(Integer id) {
		return this.employees.remove(id);
	}

	public HashMap<Integer, Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(HashMap<Integer, Employee> employees) {
		this.employees = employees;
	}

}
